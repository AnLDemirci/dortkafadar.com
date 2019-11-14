package com.acmsk.dortkafadar.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {

	private Long id;
	private String name;
	private String surName;
	private String userName;
	private String password;
	private Date age;
	private Date createDate;
	private Long follower;
	private Long following;
	private String description;
	//private Byte[] image;
	private Date updatesList;
	private Long likedComment;
	private Long likedArticle;
	
	public User() {
		super();
	}

	

	public User(Long id, String name, String surName, String userName, String password, Date age, Date createDate,
			Long follower, Long following, String description, Date updatesList, Long likedComment, Long likedArticle) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.createDate = createDate;
		this.follower = follower;
		this.following = following;
		this.description = description;
		this.updatesList = updatesList;
		this.likedComment = likedComment;
		this.likedArticle = likedArticle;
	}



	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "surName")
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	@Column(name = "userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "age")
	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}
	@Column(name = "creteDate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "follower")
	public Long getFollower() {
		return follower;
	}

	public void setFollower(Long follower) {
		this.follower = follower;
	}
	@Column(name = "following")
	public Long getFollowing() {
		return following;
	}

	public void setFollowing(Long following) {
		this.following = following;
	}
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "updateList")
	public Date getUpdatesList() {
		return updatesList;
	}

	public void setUpdatesList(Date updatesList) {
		this.updatesList = updatesList;
	}

	@Column(name = "likedComment")
	public Long getLikedComment() {
		return likedComment;
	}

	public void setLikedComment(Long likedComment) {
		this.likedComment = likedComment;
	}
	@Column(name = "likedArticle")
	public Long getLikedArticle() {
		return likedArticle;
	}

	public void setLikedArticle(Long likedArticle) {
		this.likedArticle = likedArticle;
	}
}
