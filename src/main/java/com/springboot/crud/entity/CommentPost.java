package com.springboot.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class CommentPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commentid")
	public int commentid;
	
	@Column(name="comment")
	public String comment;
	
	@Column(name="post_id")
	public int post_id;
	
	@Column(name="user_comment_id")
	public int user_comment_id;
	
	
	//required for hibernate
	public CommentPost() {
		
	}
	
	public CommentPost(String comment, int post_id, int user_comment_id) {
		this.comment = comment;
		this.post_id = post_id;
		this.user_comment_id = user_comment_id;
	}

	public int getCommentid() {
		return commentid;
	}

	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getUser_comment_id() {
		return user_comment_id;
	}

	public void setUser_comment_id(int user_comment_id) {
		this.user_comment_id = user_comment_id;
	}
	
}
