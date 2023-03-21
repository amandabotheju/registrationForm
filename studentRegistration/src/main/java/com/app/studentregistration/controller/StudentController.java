package com.app.studentregistration.controller;

import com.app.studentregistration.exception.ResourceNotFoundException;
import com.app.studentregistration.model.Student;
import com.app.studentregistration.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/student")
    public List<Student> view(){
        return studentRepo.findAll();

    }

    @PostMapping("/student")
    public Student add(@RequestBody Student student){
       return studentRepo.save(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentByID(@PathVariable("id") int id){
        return studentRepo.findById(id).get();
    }


//
//    @DeleteMapping("/delete/{id}")
//    public Student delete(@PathVariable int id){
//       return studentRepo.deleteById(id);
//    }
}
