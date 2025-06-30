package rest.api.communication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rest.api.communication.entities.User;


@RequestMapping("/apis")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	User user;
	
	@GetMapping("/data")
	public User sendUser() {
		
		return new User("gnanu","chin","987654320","gnanu123");
	}
}
