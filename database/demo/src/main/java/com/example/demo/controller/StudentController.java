package com.example.demo.controller;

import com.example.demo.dto.REQUEST.StudentRequest;
import com.example.demo.dto.RESPONSE.APIREsponse;
import com.example.demo.dto.RESPONSE.StudentResponse;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.MySqlConnection.dto.request.StudentInfoRequest;
//import com.example.MySqlConnection.dto.response.StudentInfoApiResponse;
//import com.example.MySqlConnection.dto.response.StudentInfoResponse;
//import com.example.MySqlConnection.service.StudentInfoService;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService ;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public APIREsponse<StudentResponse> createStudent(@RequestBody StudentRequest req){
        StudentResponse studentResponse  = studentService.savestdResponse(req);
        return new APIREsponse<>("success", studentResponse);
    }
}
