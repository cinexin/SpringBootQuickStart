/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.cinexin.javabrains.springbootstarter.topic.Topic;

/**
 * @author migue
 *
 * Model (entity) class for "Course" object
 */

/**
 *  We mark this class as a Database (JPA) table with the "@Entity" javax.persistence annotation 
 *  It will be mapped to a table named "Topic" with 3 columns:
 *  id + name + description
 *  
 *  */
@Entity
public class Course {
	
	/*
	 * We mark the "id" field as the primary key with the "@Id" annotation
	 */
	@Id
	private String id;
	private String name;
	private String description;

	/*
	 * the foreign key: which topic is this course covering?
	 * remember: a Course has 1 topic and a Topic can appear in N Courses
	 */
	@ManyToOne
	private Topic topic;
	
	/**
	 * @return the topic
	 */
	public Topic getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {
		super();
	}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic (topicId, "","");
	}
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
