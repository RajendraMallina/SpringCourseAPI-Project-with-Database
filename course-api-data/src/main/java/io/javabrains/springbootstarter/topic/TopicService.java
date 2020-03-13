package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	private List<Topic> topics = new ArrayList<>();

	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		
		return topics;
	}

	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getTopicId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void addTopics(List<Topic> topics) {
		topicRepository.saveAll(topics);
	}
	
	public void updateTopic(Topic topic, String id) {
		
		int index = 0;
		for(Topic currentTopic : topics) {
			if(currentTopic.getTopicId().equals(id)) {
				topics.set(index, topic);
			}
			index++;
		}
	}
	
	public Topic deleteTopic(String id) {
		
		for(Topic currentTopic : topics) {
			if(currentTopic.getTopicId().equals(id)) {
				topics.remove(currentTopic);
				return currentTopic;
			}
		}
		return new Topic();
	}

}
