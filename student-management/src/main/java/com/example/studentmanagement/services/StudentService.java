package com.example.studentmanagement.services;


import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.entity.Teacher;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository bRepo;

    @Autowired
    private TeacherRepository tRepo;

    public void save(Student b) {
        bRepo.save(b);
    }

    public List<Student> getAllStudents() {

        return bRepo.findAll();
    }


    public void save(Teacher t) {
        tRepo.save(t);
    }

    public List<Teacher> getAllTeachers() {
        return tRepo.findAll();
    }


    public void deleteStudents(int id) {
        bRepo.deleteById(id);
    }


    public void deleteTeachers(int id) {
        tRepo.deleteById(id);
    }

    public Student getStudentById(int id){
        return  bRepo.findById(id).get();
    }

    public Teacher getTeacherById(int id){
        return tRepo.findById(id).get();
    }

}
