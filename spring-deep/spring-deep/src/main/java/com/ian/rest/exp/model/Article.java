package com.ian.rest.exp.model;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

//import java.util.UUID;

public class Article {

	private String id; //= UUID.randomUUID().toString();
	private String subject;
	private String author;
	private String content;
	private Date createAt = new Date();
	
	public Article() {

	}
	
	public Article(String id, String subject, String author, String content){
		this.id = id;
		this.subject = subject;
		this.author = author;
		this.content = content;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateAt() {
		return createAt;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if(obj.getClass() != getClass()){
			return false;
		}
		
		Article article = (Article)obj;
		return new EqualsBuilder()
				.append(this.id, article.id)
				.append(this.subject, article.subject)
				.append(this.content, article.content)
				.append(this.author, article.author)
				.isEquals();		
	}
	
	@Override
	public int hashCode(){
		return new HashCodeBuilder()
				.append(id)
				.append(subject)
				.append(content)
				.append(author)
				.toHashCode();
	}
	
	@Override
	public String toString(){
		return new ToStringBuilder(this)
				.append("id", id)
				.append("subject", subject)
				.append("content", content)
				.append("author", author)
				.toString();
	}

}
