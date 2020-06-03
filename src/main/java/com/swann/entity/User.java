package com.swann.entity;


import javax.persistence.*;


import com.sun.xml.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends UserEntity<ID> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user", length = 100, nullable = false, unique = true)
	private String name;


	@Column(name = "email", length = 100, nullable = false)
	private String email;


	@Column(name = "password", length = 100, nullable = false)
	private String password;

	@OneToMany
	private List<UserPost> posts = new ArrayList<>();

	public User(){

	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User(List<UserPost> posts) {
		this.posts = posts;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserPost> getPosts() {
		return posts;
	}

	public void setPosts(List<UserPost> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password +"]";
	}

}
