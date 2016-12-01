package com.tutorialspoint.springframework.mvcexception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
@Controller
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command",new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("HelloWeb") Student student, ModelMap model) {

		if(student.getName().length() < 5) {
			throw new SpringException("Given name is to short");
		} else {
			model.addAttribute("name",student.getName());
		}

		if(student.getAge() < 10) {
			throw new SpringException("Given age is too low");
		} else {
			model.addAttribute("age", student.getAge());
		}

		model.addAttribute("id", student.getId());
		return "result";
	}
}