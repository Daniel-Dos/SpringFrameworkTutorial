package com.tutorialspoint.mvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Controller
public class RSSController {

    @GetMapping("/rssfeed")
    public ModelAndView getFeedInRss() {
	List<RSSMessage> items = new ArrayList<>();
	RSSMessage content = new RSSMessage();
	content.setTitle("Spring Tutorial");
	content.setUrl("http://www.tutorialspoint/spring");
	content.setSummary("Spring Tutrials summary...");
	content.setCreateDate(LocalDateTime.now());
	items.add(content);

	RSSMessage content2 = new RSSMessage();
	content2.setTitle("Spring MVC Tutorial");
	content2.setUrl("http://www.tutorialspoint/spring");
	content2.setSummary("Spring MVC Tutrials summary...");
	content2.setCreateDate(LocalDateTime.now());
	items.add(content2);
	ModelAndView model = new ModelAndView();
	model.setViewName("rssView");
	model.addObject("feedContent",items);

	return model;
    }
}