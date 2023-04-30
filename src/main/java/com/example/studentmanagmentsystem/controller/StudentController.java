package com.example.studentmanagmentsystem.controller;


import com.example.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }


    //handler method to handle list student and return model view

    @GetMapping("/students")
    public String listStudent(Model model){
            model.addAttribute("students",studentService.getAllStudents());
            return "students";
    }
}
