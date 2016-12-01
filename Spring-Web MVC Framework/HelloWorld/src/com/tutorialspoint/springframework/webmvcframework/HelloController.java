package com.tutorialspoint.springframework.webmvcframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String printHello(ModelMap model) {
		model.addAttribute("message","Hello Spring MVC Framework!");
		return "hello";
	}
}