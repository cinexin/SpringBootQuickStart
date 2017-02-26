/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author migue
 *
 * /topics URL controller
 * We want in this case a Controller that returns JSON file containing some useful info
 */

@RestController
public class TopicController {
	
	@RequestMapping("topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
					new Topic("1", "Java Spring", "Java Spring Framework Basis"),
					new Topic("2", "Java Core", "Java Core Fundamentals"),
					new Topic("3", "JavaScript", "JavaScript Language Basis")
				);
	}
	
}
