package com.decathlon.controller;



import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecathlonConntroller {

	@RequestMapping()
	public String addSport( String game,ModelMap model) {
		return "game";
		
		
	}
}
