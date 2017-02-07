package com.tutorialspoint.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class ExcelController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	Map<String,String> userData = new HashMap<>();
	userData.put("1", "Mahesh");
	userData.put("2", "Suresh");
	userData.put("3", "Ramesh");
	userData.put("4", "Naresh");
	return new ModelAndView("UserSummary","userData",userData);
    }
}