package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.REQUEST.StudentRequest;
import com.example.demo.dto.RESPONSE.StudentResponse;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService 
{
 private final StudentRepository StudentRepository;
 
 public StudentService(StudentRepository StudentRepository)
 {
 this.StudentRepository = StudentRepository;
 }
 public StudentResponse savestdResponse(StudentRequest request)
 {
   Student student = new Student();
   student.setName(request.getName());
   StudentRepository.save(student);
  return new StudentResponse(student.getId(), student.getName(),null); 
 }
}
