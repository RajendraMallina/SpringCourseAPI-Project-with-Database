package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@RequestMapping("/topics")
	public void getAllTopics() {
		
	}
	
	@RequestMapping("/topic/{id}")
	public void getTopic(@PathVariable String id) {
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public void addTopic(@RequestBody Topic topic) {
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopics(@RequestBody List<Topic> topics) {
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		
	}

}
