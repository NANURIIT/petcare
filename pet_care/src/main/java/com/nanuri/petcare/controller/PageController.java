package com.nanuri.petcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	// 화면이동
		@GetMapping(value = "/")
		public String index() {
			return "index";
		}
}
