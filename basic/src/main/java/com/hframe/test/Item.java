package com.hframe.test;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Item   {

	@JsonProperty("media_id")
	private String mediaId;
	@JsonProperty("content")
	private Content content;
	@JsonProperty("update_time")
	private String updateTime;

    public Item() {
    	}
   
 
 	
	public String getMediaId(){
		return mediaId;
	}

	public void setMediaId(String mediaId){
    	this.mediaId = mediaId;
    }

 	
	public Content getContent(){
		return content;
	}

	public void setContent(Content content){
    	this.content = content;
    }

 	
	public String getUpdateTime(){
		return updateTime;
	}

	public void setUpdateTime(String updateTime){
    	this.updateTime = updateTime;
    }
}
