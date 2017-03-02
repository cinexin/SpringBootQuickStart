/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author migue
 *
 * This is the class that connects to database to make DB operations with Courses
 * 
 * "The data Service" class
 */

/*
 * You see these methods will be mostly common to aaaaall entities, so...
 * Spring JPA has already done this common task for us: "CrudRepository"
 * 
 * NOTE: The Second argument of CrudRepository <arg1, arg2> is the generic type of the entity's PK
 */
// getAllCourses()
// getCourse(String id)
// updateCourse(Topic t)
// deleteCourse(String id)

public interface CourseRepository extends CrudRepository<Course, String>{

	
	/*
	 * Imagine we want a method that returns Courses based on its "name" field...
	 * ok, this is kind of crazy, but actually you don't have to IMPLEMENT it!!! :O
	 * You can just give a name with "hints" so Spring JPA knows how to do it....
	 * How? Name the methods this way:
	 * 		1. You want to "get" something from the database? Start the method with "find" token
	 * 		2. We normally want to filter by some field no? well, then the next token will be "By" ("find" + "By")
	 * 		3. We'll filter by some specific field right? so next token will be the property by which we'll filter (ie: "Name): ("find" + "By" + "Name")
	 * And JPA hopefully will do the task for us...:O
	 */
	public List<Course> findByName(String name);
	/* Analogously... */
	public List<Course> findByDescription(String description);
	
	/*
	 * We want an specific method that returns all Courses that are related with an specific topic...
	 * but the filtering field is not an String, but an Object.....
	 * but this Object will have a PK...so....we concatenate the field (ie: "Id")
	 * and Spring JPA will do the rest of the work for us :D
	 * */
	public List<Course> findByTopicId(String topicId);
	
}
