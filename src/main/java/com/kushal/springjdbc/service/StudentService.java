package com.kushal.springjdbc.service;

import com.kushal.springjdbc.model.student;
import com.kushal.springjdbc.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void add(student s) {
        System.out.println("Used in service");
        repo.save(s);
    }
    public List<student> getStudents() {
        return repo.findAll();

    }
}
