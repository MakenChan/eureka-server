package com.eurekaclient.demo;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
	

	@GetMapping(value = "/hello")
	public String index() {
		return "Hello world";
	}
}
