package com.tutorialspoint.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author daniel github:Daniel-Dos daniel.dias.analistati@gmail.com
 *         twitter:@danieldiasjava
 */
@Controller
@RequestMapping("/hello")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}