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
		user.setFavoriteFramework((new String[] {"Spring MVC","Struts 2"}));
		user.setGender("M");
		return new ModelAndView("user","command",user);
	}

	@PostMapping("/addUser")
	public String addUse(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("username",user.getUsername());
		model.addAttribute("password",user.getPassword());
		model.addAttribute("address",user.getAddress());
		model.addAttribute("receivePaper",user.isReceivePaper());
		model.addAttribute("favoriteFramework",user.getFavoriteFramework());
		model.addAttribute("favoriteNumber",user.getFavoriteNumber());
		model.addAttribute("gender",user.getGender());
		model.addAttribute("country",user.getCountry());
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

	@ModelAttribute("countryList")
	public List<String> countryList() {
		List<String> countryList = new ArrayList<>();
		countryList.add("USA");
		countryList.add("CH");
		countryList.add("Brazil");
		return countryList;
	}
}
