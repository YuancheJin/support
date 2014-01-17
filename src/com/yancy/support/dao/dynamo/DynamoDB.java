package com.yancy.support.dao.dynamo;

import org.springframework.core.io.ClassPathResource;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.dynamodb.AmazonDynamoDBClient;

public class DynamoDB {

	private static volatile AmazonDynamoDBClient dynamoDB;
	
	public static AmazonDynamoDBClient getConnection(){
		if(dynamoDB == null){
			synchronized (DynamoDB.class) {
				if(dynamoDB == null){
					try{
						dynamoDB = new AmazonDynamoDBClient(
								new PropertiesCredentials(
										new ClassPathResource("AwsCredentials.properties")
												.getInputStream()));
						dynamoDB.setEndpoint("dynamodb.ap-northeast-1.amazonaws.com");
					}catch(Exception e){
						e.printStackTrace();
					}
					
				}
			}
		}
		return dynamoDB;
	}
	

}
