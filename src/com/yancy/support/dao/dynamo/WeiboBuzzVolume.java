package com.yancy.support.dao.dynamo;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "crm_weibo_buzz_volume")
public class WeiboBuzzVolume extends DynamoModel {
	
	private String keyword;
	
	private Long timestamp;

	@DynamoDBHashKey(attributeName="keyword")
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public WeiboBuzzVolume() {
		super();
	}

	@DynamoDBRangeKey(attributeName="timestamp")
	public Long getTimestamp() {
		return timestamp;
	}

	public WeiboBuzzVolume(String keyword, Long timestamp, Long volumeDup,
			Long volumeNoDup) {
		super();
		this.keyword = keyword;
		this.timestamp = timestamp;
		this.volumeDup = volumeDup;
		this.volumeNoDup = volumeNoDup;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	private Long volumeDup;
	
	private Long volumeNoDup;

	public Long getVolumeDup() {
		return volumeDup;
	}

	public void setVolumeDup(Long volumeDup) {
		this.volumeDup = volumeDup;
	}

	public Long getVolumeNoDup() {
		return volumeNoDup;
	}

	public void setVolumeNoDup(Long volumeNoDup) {
		this.volumeNoDup = volumeNoDup;
	}

}
