package com.prajapati.demo.service;

import com.prajapati.demo.model.Student;
import com.prajapati.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;
    public void addStudent(Student s) {
       repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
