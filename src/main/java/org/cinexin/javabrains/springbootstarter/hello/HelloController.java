/**
 * 
 */
package org.cinexin.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author migue
 *
 * Spring Controller "REST"
 * We want to return a "Hello" message when user access /hello URI
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello World!";
	}
}
