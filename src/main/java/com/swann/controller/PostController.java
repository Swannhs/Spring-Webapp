package com.swann.controller;

import com.swann.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.swann.entity.User;
import com.swann.entity.UserPost;
import com.swann.repository.UserRepository;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private PostRepository repository;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/createpost")
	public String view(WebRequest request, Model model, RedirectAttributes redirectAttributes) {
		logger.debug("Rendering Create Post");
		User user = userRepository.findByName(request.getParameter("user"));
		UserPost post = new UserPost( user, request.getParameter("title"),request.getParameter("userpost"));
		repository.save(post);
		return "redirect:/login";
	}


	@RequestMapping("/viewpost")
	public String viewAll(Model model) {
//		UserPost obj = repository.findByTitle("title");
//      model.addAttribute("home.post", repository.f);

		return "index";
	}
}
