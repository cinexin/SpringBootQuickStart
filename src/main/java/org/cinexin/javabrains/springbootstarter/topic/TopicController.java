/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author migue
 *
 * /topics URI controller
 * We want in this case a Controller that returns JSON file containing some useful info
 */

@RestController
public class TopicController {
	
	/* We inject the dependecy of the Business Service here using this "Atowired" annotation */
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
}
