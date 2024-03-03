package com.example.semwebproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("")
	public String index() {
		return "index"; // This corresponds to "index.html" in the "static" directory
	}
}
