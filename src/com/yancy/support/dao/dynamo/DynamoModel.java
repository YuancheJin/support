package com.yancy.support.dao.dynamo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.dynamodb.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodb.model.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodb.datamodeling.KeyPair;
import com.amazonaws.services.dynamodb.datamodeling.PaginatedQueryList;
import com.amazonaws.util.json.JSONObject;
import org.springframework.core.io.ClassPathResource;

public abstract class DynamoModel {
	protected DynamoDBMapperConfig mapperConfig;
	protected TableNameOverride tableNameConfig;
	Log log = LogFactory.getLog(this.getClass().getName());
	
	private DynamoDBMapper mapper;
	private String tableName;
    private static AmazonDynamoDBClient dynamoDB;

    static {
        try {
            AWSCredentials credentials = new PropertiesCredentials(
                    new ClassPathResource("AwsCredentials.properties")
                            .getInputStream());
            dynamoDB = new AmazonDynamoDBClient(
                    credentials);
            dynamoDB.setEndpoint("dynamodb.ap-northeast-1.amazonaws.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public DynamoModel() {
		super();
		tableName = getTableNameFromAnnotation(this.getClass());
		mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
	}

	public void save() {
		mapper.save(this);
		log.info("["+this.getClass().getName() + " save] "+this.toString());
	}

	public DynamoDBMapperConfig getMapperConfig() {
		return mapperConfig;
	}

	public void setMapperConfig(DynamoDBMapperConfig mapperConfig) {
		this.mapperConfig = mapperConfig;
	}

	//if the table has range key, please not not use this method, use query instead
	public static<T extends DynamoModel> T find(Class<T> type, String id) {
		String tableName = getTableNameFromAnnotation(type);
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		return mapper.load(type, id);
	}
	
	public static<T extends DynamoModel> Map<String, List<Object>> batchFind(Class<T> type, List<String> ids) {
		Map<Class<?>, List<KeyPair>> map = new HashMap<Class<?>, List<KeyPair>>();
		List<KeyPair> keypairs = new ArrayList<KeyPair>();
		for(String s:ids) {
			KeyPair k = new KeyPair();
			k.setHashKey(s);
			keypairs.add(k);
		}
		map.put(type, keypairs);
		String tableName = getTableNameFromAnnotation(type);
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		return mapper.batchLoad(map);
	}
	//Notice parameter must have the same type with callee class
	public static<T extends DynamoModel> void batchSave(List<T> models) {
		if(0 == models.size()) {
			return;
		}
		String tableName = getTableNameFromAnnotation(models.get(0).getClass());
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		mapper.batchSave(models);
	}
	//only for tables have range key
	public static<T extends DynamoModel> PaginatedQueryList<T> query(Class<T> type, String id) {
		return query(type, id, true);
	}
	
	public static<T extends DynamoModel> PaginatedQueryList<T> query(Class<T> type, String id, boolean rangeKeyAscending) {
		if(rangeKeyAscending) {
			DynamoDBQueryExpression queryExpression = new DynamoDBQueryExpression(
	                new AttributeValue().withS(id));
			String tableName = getTableNameFromAnnotation(type);
			DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
			PaginatedQueryList<T> query = (PaginatedQueryList<T>) mapper.query(type, queryExpression);
			return query;
		} else {
			DynamoDBQueryExpression queryExpression = new DynamoDBQueryExpression(
	                new AttributeValue().withS(id)).withScanIndexForward(false);
			String tableName = getTableNameFromAnnotation(type);
			DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
			PaginatedQueryList<T> query = (PaginatedQueryList<T>) mapper.query(type, queryExpression);
			return query;
		}
	}
	
	public static<T extends DynamoModel> PaginatedQueryList<T> query(Class<T> type, String id, String rangeKey) {
		Condition rangeKeyCondition = new Condition()
        .withComparisonOperator(ComparisonOperator.EQ.toString())
        .withAttributeValueList(new AttributeValue().withS(rangeKey));
		
		DynamoDBQueryExpression queryExpression = new DynamoDBQueryExpression(
                new AttributeValue().withS(id));
		queryExpression.setRangeKeyCondition(rangeKeyCondition);
		String tableName = getTableNameFromAnnotation(type);
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		PaginatedQueryList<T> query = (PaginatedQueryList<T>) mapper.query(type, queryExpression);
		return query;
	}
	
	public static<T extends DynamoModel> PaginatedQueryList<T> query(Class<T> type, String id, String rangeKeyMin,String rangeKeyMax) {
		AttributeValue startVal = new AttributeValue().withN(rangeKeyMin);
		AttributeValue endVal = new AttributeValue().withN(rangeKeyMax);
		
		Condition rangeKeyCondition = new Condition()
        .withComparisonOperator(ComparisonOperator.BETWEEN.toString())
        .withAttributeValueList(startVal, endVal);
		
		DynamoDBQueryExpression queryExpression = new DynamoDBQueryExpression(
                new AttributeValue().withS(id));
		queryExpression.setRangeKeyCondition(rangeKeyCondition);
		String tableName = getTableNameFromAnnotation(type);
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		PaginatedQueryList<T> query = (PaginatedQueryList<T>) mapper.query(type, queryExpression);
		return query;
	}
	
	public static<T extends DynamoModel> List<T> query(Class<T> type, String id, List<String> rangeKeyList) {
//		Collection<AttributeValue> attrs = new ArrayList<AttributeValue>();
		List<T> result = new ArrayList<T>();
		for (String rangeKey : rangeKeyList) {
//			attrs.add(new AttributeValue().withS(rangeKey));
			List<T> res = query(type, id, rangeKey);
			if(res != null && res.size() == 1) {
				result.add(res.get(0));
			}
		}
		//we can not use in here, since in can only be used in scan operation
		/*Condition rangeKeyCondition = new Condition()
        .withComparisonOperator(ComparisonOperator.IN.toString())
        .withAttributeValueList(attrs);
		
		DynamoDBQueryExpression queryExpression = new DynamoDBQueryExpression(
                new AttributeValue().withS(id));
		queryExpression.setRangeKeyCondition(rangeKeyCondition);
		
		PaginatedQueryList<T> query = (PaginatedQueryList<T>) mapper.query(type, queryExpression);*/
		return result;
	}

	@Override
	public String toString() {
		JSONObject o = new JSONObject(this);
		return o.toString();
	}
	
	public static<T extends DynamoModel> String getTableNameFromAnnotation(Class<T> type) {
		DynamoDBTable tableAnnotation = type.getAnnotation(DynamoDBTable.class);
		if(tableAnnotation.tableName().startsWith("fb_")) {
		    return tableAnnotation.tableName();
		}
		int p = tableAnnotation.tableName().indexOf("_");
		String tableName = getTablePrefix()+tableAnnotation.tableName().substring(p+1);
		
		return tableName;
	}
	
	public static DynamoDBMapperConfig contructMapperConfig(String tableName) {
		TableNameOverride tableNameConfig = new TableNameOverride(tableName);
		DynamoDBMapperConfig mapperConfig = new DynamoDBMapperConfig(SaveBehavior.CLOBBER, ConsistentReads.EVENTUAL, tableNameConfig);
		mapperConfig.getSaveBehavior();
		return mapperConfig;
	}
	
	public static<T extends DynamoModel> void delete(Class<T> type, T item) {
		String tableName = getTableNameFromAnnotation(type);
		DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
		mapper.delete(item);
	}

    public static<T extends DynamoModel> void batchDelete(Class<T> type, List<? extends DynamoModel> objectsToSave) {
        String tableName = getTableNameFromAnnotation(type);
        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDB.getConnection(), contructMapperConfig(tableName));
        mapper.batchDelete(objectsToSave);
    }
    
    public static String getTablePrefix(){
    	return "crm_";
    }

    /**
     * 创建表
     * @param tableName
     * @param hashName
     * @param hashAttr
     * @param rangeName
     * @param rangeAttr
     * @param readCapacity
     * @param writeCapacity
     */
    public static void createTable(String tableName, String hashName, ScalarAttributeType hashAttr, String rangeName,
                                   ScalarAttributeType rangeAttr, Long readCapacity, Long writeCapacity) {
        KeySchema keySchema = new KeySchema();
        KeySchemaElement kse1 = new KeySchemaElement();
        kse1.setAttributeName(hashName);
        kse1.setAttributeType(hashAttr);
        KeySchemaElement kse2 = new KeySchemaElement();
        kse2.setAttributeName(rangeName);
        kse2.setAttributeType(rangeAttr);
        keySchema.setHashKeyElement(kse1);
        keySchema.setRangeKeyElement(kse2);
        CreateTableRequest request = new CreateTableRequest(tableName, keySchema);
        ProvisionedThroughput throughput = new ProvisionedThroughput();
        throughput.setReadCapacityUnits(readCapacity);
        throughput.setWriteCapacityUnits(writeCapacity);
        request.setProvisionedThroughput(throughput);

        dynamoDB.createTable(request);
    }

    /**
     * 删除表
     * @param tableName
     */
    public static void deleteTable(String tableName) {
        DeleteTableRequest request = new DeleteTableRequest(tableName);
        dynamoDB.deleteTable(request);
    }
    
//    public static void main(String[] args){
//    	
//    	DynamoModel.query("crm_weibo_buzz_volume", "快客", "1377129600000", "1389281511804");
//    }
}
