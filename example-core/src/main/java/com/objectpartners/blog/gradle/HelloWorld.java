package com.objectpartners.blog.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

	public static final void main(String args[]) {
		log.debug("Executing...");
		System.out.println("Hello World");
	}
}
