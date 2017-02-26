/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	/* Method for getting ALL topics */
	/* Note that GET is the default HTTP Method */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	/* Method for getting an specific topic */
	/* take a look at the PathVariable Annotation! */
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	/* Method for inserting a new topic */
	/* When "HTTP POST" happens on /topics URI */
	/* RequestBody annotation says: "Hey, the Topic info will be in the payload in the form of a JSON" */ 
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
}
