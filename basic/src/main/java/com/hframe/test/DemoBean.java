package com.hframe.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public class DemoBean   {

	@JsonProperty("total_count")
	private String totalCount;
	@JsonProperty("item_count")
	private String itemCount;
	@JsonProperty("item")
	private List<Item> itemList;

    public DemoBean() {
    }
   
 
 	
	public String getTotalCount(){
		return totalCount;
	}

	public void setTotalCount(String totalCount){
    	this.totalCount = totalCount;
    }

 	
	public String getItemCount(){
		return itemCount;
	}

	public void setItemCount(String itemCount){
    	this.itemCount = itemCount;
    }

 	
	public List<Item> getItemList(){
		return itemList;
	}

	public void setItemList(List<Item> itemList){
    	this.itemList = itemList;
    }
}
