package com.tutorialspoint.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
public class StudentController {

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}

	@GetMapping("/addStudent")
	public ModelAndView Student() {
		return new ModelAndView("addStudent","command",new Student());
	}

	@ModelAttribute("student")
	public Student createStudentModel() {
		return new Student();
	}

	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") @Validated Student student,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "addStudent";
		}
		model.addAttribute("name",student.getName());
		model.addAttribute("age",student.getAge());
		model.addAttribute("id",student.getId());
		return "result";
	}
}