/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author migue
 *
 * Spring Business Service for "Topic" Resource
 */
@Service
public class TopicService {

	/**
	 * this is how we "link" our main service with the class that connects and make CRUD ops with the database
	 * (in this case: "TopicRepository")
	 * We "autowire" this member variable and Spring automagically will inject the dependency
	 */
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
					new Topic("spring", "Java Spring", "Java Spring Framework Basis"),
					new Topic("java", "Java Core", "Java Core Fundamentals"),
					new Topic("javascript", "JavaScript", "JavaScript Language Basis")
				)
			);
	
	public List<Topic> getAllTopics() {
		/*
		 *  OLD (static info): 
		 *  return topics;
		 */
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().
			forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(String id) { 
		/*
		 * 
		 *  OLD (static info):
		 *  lambda solution....CLASSY!!! 
		 *  return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		 */
		
		return topicRepository.findOne("id");
	}

	public void addTopic(Topic topic) {
		/*
		 *  OLD (static info): 
		 *  topics.add(topic);
		 */
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		/*
		 	OLD (static info):
			Topic currentTopic = topics.get(i);
			if (currentTopic.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		*/
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		/* OLD (static info): 
		 * topics.removeIf(t -> t.getId().equals(id));
		 */
		topicRepository.delete(id);
		
	}
}
