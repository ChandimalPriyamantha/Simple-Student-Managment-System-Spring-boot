package com.example.studentmanagmentsystem.service.imp;

import com.example.studentmanagmentsystem.entity.Student;
import com.example.studentmanagmentsystem.repository.StudentRepository;
import com.example.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service - We mark Spring beans with @Service annotation to indicate that they're holding the business logic
@Service
public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
