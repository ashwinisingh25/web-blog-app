package com.springboot.crud.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;

@Entity
@Table(name="post")
@SecondaryTable(name="comment", pkJoinColumns= @PrimaryKeyJoinColumn(name="commentid"))
public class BlogViewEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="postid")
	public int postid;
	
	@Column(name="post")
	public String post;
	
	@Column(name="comment", table="comment")
	public String comment;
	
	
	
	public BlogViewEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public BlogViewEntity(String post, String comment) {
		this.post = post;
		this.comment = comment;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
