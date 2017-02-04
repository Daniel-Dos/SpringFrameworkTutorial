package com.tutorialspoint.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView user() {
		User user = new User();
		user.setFavoriteFrameworks((new String[] {"Spring MVC","Struts 2"}));
		user.setGender("M");
		return new ModelAndView("user","command",user);
	}

	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("SpringWeb") User use, ModelMap model) {
		model.addAttribute("username",use.getUsername());
		model.addAttribute("password",use.getPassword());
		model.addAttribute("address",use.getAddress());
		model.addAttribute("receivePaper",use.isReceivePaper());
		model.addAttribute("favoriteFrameworks",use.getFavoriteFrameworks());
		model.addAttribute("gender",use.getGender());
		model.addAttribute("favoriteNumber",use.getFavoriteNumber());
		return "users";
	}

	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {
		List<String> webFrameworkList = new ArrayList<>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("JSF");
		return webFrameworkList;
	}

	@ModelAttribute("numberList")
	public List<String> numberList() {
		List<String> numberList = new ArrayList<>();
		numberList.add("1");
		numberList.add("2");
		numberList.add("3");
		numberList.add("4");
		return numberList;
	}
}