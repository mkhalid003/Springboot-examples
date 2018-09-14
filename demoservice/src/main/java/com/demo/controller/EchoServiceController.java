package com.demo.controller;


import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoServiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EchoServiceController.class);
	
	@RequestMapping(value="/echo", method = RequestMethod.GET, produces="text/plain")
	public String echoMessage(@PathParam(value = "name") String name) throws Exception {
		LOGGER.info("[EchoServiceController] executing echoMessage");
		
		if(name!=null && name.length() > 0) {
			
			return "Hello Mr. "+name +" Welcome to xavient";
		}
		else {
			
			LOGGER.error("Please provide your name");
			throw new Exception("Please provide your name");
		}
	}
}