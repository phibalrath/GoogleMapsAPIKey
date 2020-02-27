package com.tts.MapsApp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.MapsApp2.model.Location;
import com.tts.MapsApp2.service.MapService;

@Controller
public class MapController {
	
	@Autowired
	private MapService mapService;
	
	@GetMapping("/")
	public String getDefaultMap(Model model) {
		model.addAttribute(new Location());
		return "index";
	}
	
	@PostMapping("/home")
	public String getMapForLocation (Location location, Model model) {
		mapService.addCoordinates(location);
		model.addAttribute(location);
		return "index";
	}
	
	
}
