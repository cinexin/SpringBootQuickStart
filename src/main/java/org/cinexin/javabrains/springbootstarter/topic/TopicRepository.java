/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * @author migue
 *
 * This is the class that connects to database to make DB operations with Topics
 * 
 * "The data Service" class
 */

/*
 * You see these methods will be mostly common to aaaaall entities, so...
 * Spring JPA has already done this common task for us: "CrudRepository"
 * 
 * NOTE: The Second argument of CrudRepository <arg1, arg2> is the generic type of the entity's PK
 */
// getAllTopics()
// getTopic(String id)
// updateTopic(Topic t)
// deleteTopic(String id)

public interface TopicRepository extends CrudRepository<Topic, String>{


}
