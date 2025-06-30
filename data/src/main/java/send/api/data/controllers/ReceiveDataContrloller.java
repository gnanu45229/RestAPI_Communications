package send.api.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import send.api.data.entities.User;


@RequestMapping("/get")
@RestController
public class ReceiveDataContrloller {
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/data")
	public User callAPI() {
				
		User user=rest.getForObject("http://localhost:8080/apis/data", User.class);
		return user;
		
	}

}
