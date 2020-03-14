package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void addTopics(List<Topic> topics) {
		topicRepository.saveAll(topics);
	}
	
	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}
	
	public Optional<Topic> deleteTopic(String id) {
		
		Optional<Topic> topic = topicRepository.findById(id);
		topicRepository.deleteById(id);
		return topic;
	}

}
