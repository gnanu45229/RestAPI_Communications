package rest.api.communication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import rest.api.communication.entities.User;

@Controller
@Slf4j
@RequestMapping("/apis")
public class HomeController {
	
	@Autowired
	User user;
	@GetMapping("/home")
	public String LaunchHome(Model model) {
		
		user.setFname("gnanu");
		user.setLname("chinthamani");
		model.addAttribute("user", user);
		
		return "home";
		
	}
	
}
