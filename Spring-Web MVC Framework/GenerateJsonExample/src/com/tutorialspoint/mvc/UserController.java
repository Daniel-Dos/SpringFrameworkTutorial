package com.tutorialspoint.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author daniel github:Daniel-Dos daniel.dias.analistati@gmail.com
 *         twitter:@danieldiasjava
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("{name}")
    public @ResponseBody User getUser(@PathVariable String name) {
	User user = new User();
	user.setName(name);
	user.setId(1);
	return user;
    }
}