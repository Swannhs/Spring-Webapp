package com.swann.controller;

import com.swann.entity.UserPost;
import com.swann.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;

@Controller
public class PostViewController {
	@Autowired
	PostRepository repository;

	@RequestMapping("/")
	public String viewPage(Model model) {
		Iterable<UserPost> array =  repository.findAll();
		for (UserPost posts : array){
			model.addAttribute("name",posts.getUser().getName());
			model.addAttribute("date", posts.getCreatedDate());
			model.addAttribute("title", posts.getTitle());
			model.addAttribute("post",posts.getPost());
		}
		return "index";
	}
}
