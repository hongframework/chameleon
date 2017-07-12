package com.hframe.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public class Content   {

	@JsonProperty("news_item")
	private List<NewsItem> newsItemList;

    public Content() {
    	}
   
 
 	
	public List<NewsItem> getNewsItemList(){
		return newsItemList;
	}

	public void setNewsItemList(List<NewsItem> newsItemList){
    	this.newsItemList = newsItemList;
    }
}
