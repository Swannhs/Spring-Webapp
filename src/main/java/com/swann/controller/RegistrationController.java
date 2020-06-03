package com.swann.controller;

import com.swann.entity.User;
import com.swann.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Random;

@Controller
public class RegistrationController {
	@Autowired
    private UserRepository repository;

    @RequestMapping("/addUser")
    public String Register(WebRequest request) {
        User obj = new User(request.getParameter("user_name"), request.getParameter("user_email"), request.getParameter("password"));
        repository.save(obj);
        return "redirect:/";
    }
}
