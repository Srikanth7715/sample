package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Student;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public Student greet() {
		Student s = new Student("Srikanth", "10730303");
		return s;
	}
}
