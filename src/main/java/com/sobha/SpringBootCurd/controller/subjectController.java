package com.sobha.SpringBootCurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sobha.SpringBootCurd.Entity.subject;
import com.sobha.SpringBootCurd.service.subjectService;

@RestController
@RequestMapping("/app")
public class subjectController {
	@Autowired
	private subjectService subjectService;

	@GetMapping("/sub")
	public List<subject> getAllsubjects() {
		return subjectService.getAllsubjects();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/subjects")
	public void addSubject(@RequestBody subject subject) {
		subjectService.addSubject(subject);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody subject subject) {
		subjectService.updateSubject(id, subject);
	}

	public void deleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}
}
