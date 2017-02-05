package com.tutorialspoint.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class UserController extends MultiActionController {

	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("home");
		model.addObject("message","Home");
		return model;
	}

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("user");
		model.addObject("message","Add");
		return model;
	}

	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("user");
		model.addObject("message","Remove");
		return model;
	}
}