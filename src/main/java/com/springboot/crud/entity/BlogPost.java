package com.springboot.crud.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="post")
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="postid")
	public int postid;
	
	@Column(name="post")
	public String post;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_time")
	public Date post_time;
	
	@Column(name="user_id")
	public int user_id;
	
	public BlogPost() {
		// TODO Auto-generated constructor stub
	}
	
	public BlogPost(String post, Date post_time, int user_id) {
		
		this.post = post;
		this.post_time = post_time;
		this.user_id = user_id;
		}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Date getPost_time() {
		return post_time;
	}

	public void setPost_time(Date post_time) {
		this.post_time = post_time;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	

}
