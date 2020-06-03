package com.swann.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/login")
    public String Login() {

        return "login";
    }

    @RequestMapping("/register")
    public String Register() {
        logger.debug("Rendering Register page");
        return "register";
    }

    @RequestMapping("/post")
    public String post() {
        logger.debug("Rendering Post");
        return "post";
    }

    @RequestMapping("/forget")
    public String forget() {
        logger.debug("Rendering Forget page");
        return "forget";
    }
}
