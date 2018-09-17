package com.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.vo.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {
	
	
	@RequestMapping(value="/ping", method = RequestMethod.GET, produces="text/html")
	public String ping() {
		return "Connected with Employee API";
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces="application/json")
	public Employee getEmployee() {
		return new Employee("M Khalid", "28");
	}
}
