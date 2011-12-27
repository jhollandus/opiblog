package com.objectpartners.blog.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

	public static final void main(String args[]) {
		log.debug("Executing...");
		
		Guest guest = new Guest();
		
		if(args.length > 1) {
			guest.setName(args[1]);
		} else {
			guest.setName("Anonymous");
		}
		
		Greeter greeter = new Greeter();
		
		System.out.println(greeter.greet(guest));
	}
}
