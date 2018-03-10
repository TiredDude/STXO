package com.dev.game.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.game.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger LOG = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/*")
	public String index(Model model) {
		return "redirect:/login";
	}

	@RequestMapping(value = "/room",  method=RequestMethod.POST)
	public String home(@RequestParam String pass,@RequestParam String login, Model model) {
		LOG.info("request to /home, show Home page");
		return "room";
	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.POST)
	public String logout(Model model) {
		LOG.info("request to /home, show Home page");
		return "login";
	}
	
	@RequestMapping(value = "/login" )
	public String login(Model model) {
		LOG.info("request to /home, show Home page");
		return "login";
	}
	
	@RequestMapping(value = "/login",  method=RequestMethod.POST)
	public String loginSubmit(@RequestParam String pass,@RequestParam String login,Model model) {
		LOG.info("request to /home, show Home page");
		model.addAttribute("login",login);
		return "room";
	}
	
	
	@RequestMapping(value = "/registration", method=RequestMethod.GET)
	public String registration(Model model) {
		LOG.info("request to /home, show Home page");
		return "registration";
	}
	
	
	@RequestMapping(value = "/game", method=RequestMethod.POST)
	public String game(Model model) {
		LOG.info("request to /home, show Home page");
		return "game";
	}
	
	
}
