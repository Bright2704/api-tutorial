package com.example.demo.service;

import com.example.demo.entity.Student;

import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
//    @Autowired
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
            this.studentRepository=studentRepository;
    }
//
//    public List<Student> getStudent(){return this.studentRepository.findAll();}
//
//    public void addNewStudent(Student student){
//        studentRepository.save(student);
//
//    }
}
