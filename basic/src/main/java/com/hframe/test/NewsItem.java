package com.hframe.test;

import com.fasterxml.jackson.annotation.JsonProperty;


public class NewsItem   {

	@JsonProperty("title")
	private String title;
	@JsonProperty("thumb_media_id")
	private String thumbMediaId;
	@JsonProperty("thumb_url")
	private String thumbUrl;
	@JsonProperty("show_cover_pic")
	private String showCoverPic;
	@JsonProperty("author")
	private String author;
	@JsonProperty("digest")
	private String digest;
	@JsonProperty("content")
	private String content;
	@JsonProperty("url")
	private String url;
	@JsonProperty("content_source_url")
	private String contentSourceUrl;

    public NewsItem() {
    	}
   
 
 	
	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
    	this.title = title;
    }

 	
	public String getThumbMediaId(){
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId){
    	this.thumbMediaId = thumbMediaId;
    }

 	
	public String getThumbUrl(){
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl){
    	this.thumbUrl = thumbUrl;
    }

 	
	public String getShowCoverPic(){
		return showCoverPic;
	}

	public void setShowCoverPic(String showCoverPic){
    	this.showCoverPic = showCoverPic;
    }

 	
	public String getAuthor(){
		return author;
	}

	public void setAuthor(String author){
    	this.author = author;
    }

 	
	public String getDigest(){
		return digest;
	}

	public void setDigest(String digest){
    	this.digest = digest;
    }

 	
	public String getContent(){
		return content;
	}

	public void setContent(String content){
    	this.content = content;
    }

 	
	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
    	this.url = url;
    }

 	
	public String getContentSourceUrl(){
		return contentSourceUrl;
	}

	public void setContentSourceUrl(String contentSourceUrl){
    	this.contentSourceUrl = contentSourceUrl;
    }
}
