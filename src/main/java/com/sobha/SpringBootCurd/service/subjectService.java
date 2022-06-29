package com.sobha.SpringBootCurd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobha.SpringBootCurd.Entity.subject;
import com.sobha.SpringBootCurd.repository.subjectRepository;

@Service
public class subjectService {
	@Autowired
	public subjectRepository subjectrepo;

	public List<subject> getAllsubjects() {
		List<subject> subjects = new ArrayList<>();
		subjectrepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(subject subject) {
		subjectrepo.save(subject);

	}

	public void updateSubject(String id, subject subject) {
		subjectrepo.save(subject);
	}

	public void deleteSubject(String id) {
		subjectrepo.deleteById(id);

	}
}
