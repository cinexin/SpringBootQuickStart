/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author migue
 *
 * Spring Business Service for "Topic" Resource
 */
@Service
public class TopicService {

	
	List<Topic> topics = Arrays.asList(
			new Topic("1", "Java Spring", "Java Spring Framework Basis"),
			new Topic("2", "Java Core", "Java Core Fundamentals"),
			new Topic("3", "JavaScript", "JavaScript Language Basis")
		);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
