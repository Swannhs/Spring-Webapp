package com.swann.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.swann.entity.User;
import com.swann.repository.UserRepository;

@Controller
public class LoginController {
	@Autowired
	private UserRepository repository;

	@RequestMapping("/userlogin")
	public String Login(WebRequest request, Model model) {
		try {
			User obj = repository.findByName(request.getParameter("user"));
			if (obj.getPassword().equals(request.getParameter("password"))) {
				model.addAttribute("username",request.getParameter("user"));
				return "/post";
			} else {
				return "redirect:/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/login";
		}
	}
}
