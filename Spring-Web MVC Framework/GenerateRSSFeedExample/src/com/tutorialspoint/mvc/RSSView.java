package com.tutorialspoint.mvc;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;


/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class RSSView extends AbstractRssFeedView {

    @Override
    protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {
	feed.setTitle("TutorialsPoint Dot Com");
	feed.setDescription("Java Tutorials and examples");
	feed.setLink("http://www.tutorialspoint.com");
	super.buildFeedMetadata(model, feed, request);
    }

    @Override
    protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
	List<RSSMessage> listContent = (List<RSSMessage>) model.get("feedContent");
	List<Item> items = new ArrayList<>(listContent.size());

	listContent.forEach(tempContent->{
	    Item item = new Item();
	    Content content = new Content();
	    content.setValue(tempContent.getSummary());
	    item.setContent(content);

	    item.setTitle(tempContent.getTitle());
	    item.setLink(tempContent.getUrl());
	    item.setPubDate(Date.from(tempContent.getCreateDate().atZone(ZoneId.systemDefault()).toInstant()));
	    items.add(item);
	    System.out.println(new Date());
	});
	return items;
    }
}