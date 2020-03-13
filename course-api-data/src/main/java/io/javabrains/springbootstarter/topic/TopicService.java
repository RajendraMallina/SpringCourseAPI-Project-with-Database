package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

public class TopicService {
	
	private List<Topic> topics = new ArrayList<>();

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getTopicId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void addTopics(List<Topic> topics) {
		
		for(Topic newTopic : topics) {
			this.topics.add(newTopic);
		}
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
