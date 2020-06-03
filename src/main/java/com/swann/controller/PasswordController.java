package com.swann.controller;

import com.swann.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Random;

@Controller
public class PasswordController {
    @Autowired
    private JavaMailSender javaMailSender;
    private static int verify;

    @Autowired
    private UserRepository repository;

    @RequestMapping("/lostaccount")
    public String lostAccount(WebRequest request) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(request.getParameter("email"));
        msg.setSubject("Verification of your email address ");
        Random random = new Random();
        verify = random.nextInt((9999 - 1000));
        msg.setText("Your verification code is " + String.valueOf(verify));
        javaMailSender.send(msg);
        return "redirect:/login";
    }

    @RequestMapping("/verify")
    public String cheak(WebRequest request) {
        System.out.println(request.getParameter("verify"));
        System.out.println(verify);
        if (request.getParameter("verify").equals(String.valueOf(verify))) {
            return "Successful";
        } else {
            return "index";
        }
    }
}
