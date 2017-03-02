/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.cinexin.javabrains.springbootstarter.topic.Topic;
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
public class CourseController {
	
	/* We inject the dependecy of the Business Service here using this "Atowired" annotation */
	@Autowired
	private CourseService courseService;
	
	/* Method for getting ALL courses */
	/* Note that GET is the default HTTP Method */
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	/* Method for getting an specific course */
	/* take a look at the PathVariable Annotation! */
	@RequestMapping("/topics/{topicsId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	/* Method for inserting a new course */
	/* When "HTTP POST" happens on /courses URI */
	/* RequestBody annotation says: "Hey, the Course info will be in the payload in the form of a JSON" */ 
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic (topicId, "",""));
		courseService.addCourse(course);
	}
	
	/* Method for updating an existing topic */
	/* When "HTTP PUT" happens on /topics URI */
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "",""));
		courseService.updateCourse(course);
	}
	
	
	/* Method for deleting an existing topic by its "id" */
	/* When "HTTP PUT" happens on /topics URI */
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}	
}
