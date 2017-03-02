/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author migue
 *
 * Model (entity) class for "Topic" object
 */

/**
 *  We mark this class as a Database (JPA) table with the "@Entity" javax.persistence annotation 
 *  It will be mapped to a table named "Topic" with 3 columns:
 *  id + name + description
 *  
 *  */
@Entity
public class Topic {
	
	/*
	 * We mark the "id" field as the primary key with the "@Id" annotation
	 */
	@Id
	private String id;
	private String name;
	private String description;

	
	public Topic() {
		super();
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
