package com.tutorialspoint.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @author daniel github:Daniel-Dos daniel.dias.analistati@gmail.com
 *         twitter:@danieldiasjava
 */
public class UserController extends MultiActionController {

	public ModelAndView home(HttpServletRequest request,HttpServletResponse Response) {
		return new ModelAndView("user","message","Home");
	}

	public ModelAndView add(HttpServletRequest request,HttpServletResponse Response) {
		return new ModelAndView("user","message","Add");
	}

	public ModelAndView remove(HttpServletRequest request,HttpServletResponse Response) {
		return new ModelAndView("user","message","Remove");
	}
}