package com.tutorialspoint.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author daniel github:Daniel-Dos daniel.dias.analistati@gmail.com
 *         twitter:@danieldiasjava
 */
@Controller
@RequestMapping("/hello")
public class UserController {

	@GetMapping
	public String printHello(ModelMap model) {
		model.addAttribute("message","Hello Spring MVC Framework");
		return "user";
	}
}