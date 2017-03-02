/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author migue
 *
 * Spring Business Service for "Course" Resource
 */
@Service
public class CourseService {

	/**
	 * this is how we "link" our main service with the class that connects and make CRUD ops with the database
	 * (in this case: "CourseRepository")
	 * We "autowire" this member variable and Spring automagically will inject the dependency
	 */
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).
			forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(String id) { 

		
		return courseRepository.findOne("id");
	}

	public void addCourse(Course course) {

		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {

		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {

		courseRepository.delete(id);
		
	}
}
