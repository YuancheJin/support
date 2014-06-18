package com.yancy.support.dao.sqs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.GetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.yancy.support.pojo.Modules;

public class SQS {

	public static void main(String[] args) {

		// pushTo("actsocial_queue","nivea");
		// getCount("actsocial_hourly_queue");
		// getCount("run_buzz_range_day");
		pushTo("test","qwe1");
		pushTo("test","qwe2");
		pushTo("test","qwe3");
		pushTo("test","qwe4");
		getCount("test");
	}

	public enum Name {
		ACTSOCIAL_QUEUE, ACTSOCIAL_QUEUE_5, TOPIC_DATA_QUEUE, THREAD_DATA_QUEUE, BUZZ_QUEUE, INSTANCE_QUEUE, ACTSOCIAL_HOURLY_QUEUE, INDEX_POSTS_QUEUE, RERUN_ERROR_DATA_BY_DAILY;
		public String value() {
			if (this.equals(Name.BUZZ_QUEUE)
					|| this.equals(Name.INDEX_POSTS_QUEUE)) {
				return this.toString().toLowerCase();
			}
			if (Context.isTest()) {
				return "test_" + this.toString().toLowerCase();
			} else {
				return this.toString().toLowerCase();
			}
		}
	}

	private static volatile AmazonSQS sqs;

	public static AmazonSQS getConnection() throws Exception {
		if (sqs == null) {
			synchronized (AmazonSQS.class) {
				sqs = new AmazonSQSClient(new PropertiesCredentials(
						new ClassPathResource("AwsCredentials.properties")
								.getInputStream()));
				sqs.setEndpoint("sqs.ap-northeast-1.amazonaws.com");
			}
		}
		return sqs;
	}

	public static String popFrom(Name name) {
		return popFrom(name.value());
	}

	public static String popFrom(String name) {
		try {
			String queueUrl = getConnection().createQueue(
					new CreateQueueRequest(name)).getQueueUrl();
			ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(
					queueUrl);
			receiveMessageRequest.setMaxNumberOfMessages(1);
			if (null != receiveMessageRequest) {
				List<Message> messages = getConnection().receiveMessage(
						receiveMessageRequest).getMessages();
				if (messages.size() > 0) {
					String messageRecieptHandle = messages.get(0)
							.getReceiptHandle();
					getConnection().deleteMessage(
							new DeleteMessageRequest(receiveMessageRequest
									.getQueueUrl(), messageRecieptHandle));
					return messages.get(0).getBody();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 拿到每个队列中的 数字
	public static int getCount(String name) {
		try {
			String queueUrl = getConnection().createQueue(
					new CreateQueueRequest(name)).getQueueUrl();

			
	        List<String> attributeNames = new ArrayList<String>();
	        attributeNames.add("All");

	        // list the attributes of the queue we are interested in
	        GetQueueAttributesRequest request = new GetQueueAttributesRequest(queueUrl);
	        request.setAttributeNames(attributeNames);
	        Map<String, String> attributes = sqs.getQueueAttributes(request).getAttributes();
	        int messages = Integer.parseInt(attributes.get("ApproximateNumberOfMessages"));
	        //System.out.println("Messages in the queue: " + messages);
	        return messages;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static boolean pushTo(String name, String message) {
		try {
			String queueUrl = getConnection().createQueue(
					new CreateQueueRequest(name)).getQueueUrl();
			SendMessageRequest sendMessageRequest = new SendMessageRequest(
					queueUrl, message);
			if (null != sendMessageRequest) {
				getConnection().sendMessage(sendMessageRequest);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean pushTo(Name name, String message) {
		return pushTo(name.value(), message);
	}
	/**
	 * modify : send to sns-crawler if onlynum = true
	 * 
	 * @param module
	 */
	public static void enqueue(Modules module) {
		String scope = module.getScope();
		// System.out.println("--enqueue---push to actsocial queue:"+scope);
		// SQS.pushTo(SQS.Name.ACTSOCIAL_QUEUE, scope);

		String buzzKeyword = module.getBuzzKeyword();
		if (buzzKeyword != null && !"".equals(buzzKeyword)
				&& module.getOnlynum()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sns_id", 2);
			map.put("keyword", buzzKeyword);
			map.put("scope", scope);
			map.put("count", "7");
			map.put("onlynum", 0);
			if (module.getOnlynum()) {
				map.put("buzz_get_num", 100);
			}
			if (module.getPriority().equals(5)) {
				map.put("from", SQS.Name.ACTSOCIAL_QUEUE_5.value());
			} else {
				map.put("from", SQS.Name.ACTSOCIAL_QUEUE.value());
			}

			map.put("date", DateUtils.getMidNight().getTimeInMillis() / 1000);
			System.out.println("push to buzz queue:" + map);
			SQS.pushTo(SQS.Name.BUZZ_QUEUE, JsonParser.map2Json(map));
		} else {
			System.out.println("push to actsocial queue:" + scope);
			if (module.getPriority() != null && module.getPriority().equals(5)) {
				SQS.pushTo(SQS.Name.ACTSOCIAL_QUEUE_5, scope);
			} else {
				SQS.pushTo(SQS.Name.ACTSOCIAL_QUEUE, scope);
			}

		}
	}

	public static void enqueue2ActsocialQueue(String scope) {
		SQS.pushTo(SQS.Name.ACTSOCIAL_QUEUE, scope);
	}

	public static void enqueue2(Modules module) {
		String scope = module.getScope();
		String buzzKeyword = module.getBuzzKeyword();
		if (buzzKeyword != null && !"".equals(buzzKeyword)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sns_id", 2);
			map.put("keyword", buzzKeyword);
			map.put("scope", scope);
			map.put("count", "90");
			map.put("onlynum", module.getOnlynum());
			map.put("date", DateUtils.getMidNight().getTimeInMillis() / 1000);
			System.out.println("push to buzz queue:" + map);
			SQS.pushTo(SQS.Name.BUZZ_QUEUE, JsonParser.map2Json(map));
		} else {
			System.out.println("push to actsocial queue:" + scope);
			SQS.pushTo(SQS.Name.ACTSOCIAL_QUEUE, scope);
		}
	}

}
