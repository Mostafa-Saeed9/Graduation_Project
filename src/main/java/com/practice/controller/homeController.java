package com.practice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {

	@GetMapping("/")
	public String getHome() {
		return "index";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@PostMapping("/loginAccount")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
		// Check if the email and password are correct
		if (email.equals("user@gmail.com") && password.equals("user")) {
			return "clientPage";
		} else {
			session.setAttribute("msg", "Invalid Email OR Password");
			return "login";
		}
	}

	@GetMapping("/clientPage")
	public String getclientPage() {
		return "clientPage";
	}

	@GetMapping("/notificationPage")
	public String getnotificationPage() {
		return "notificationPage";
	}

}
