package com.tutorialspoint.springframework.mvcstatic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author daniel Daniel-Dos daniel.dias.analistati@gmail.com
 */
@Controller
public class WebController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/pages/final.htm";
	}
}