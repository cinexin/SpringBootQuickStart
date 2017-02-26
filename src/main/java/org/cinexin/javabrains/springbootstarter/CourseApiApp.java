/**
 * 
 */
package org.cinexin.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author migue
 *
 * This is the "main" class
 * Actually contains the "main" Java method, that starts the servlet container
 * (@SpringBootApplication tag does the "magic")
 */
@SpringBootApplication
public class CourseApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseApiApp.class, args);
	}

}
