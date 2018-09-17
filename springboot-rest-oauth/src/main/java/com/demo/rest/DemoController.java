package com.demo.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value="/about", method = RequestMethod.GET, produces="text/html")
	public String getAboutContent() {
		return " This is the about page of crm application !";
	}
}
