package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.entity.Teacher;

import com.example.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;



@Controller
public class StudentController {

    @Autowired
    private StudentService service;


    @GetMapping("/")
        public String home(){
            return "admin";
        }

     @GetMapping("/student_register")
    public String studentRegister(){
        return "studentRegister";  //the page will be returned here as he name student register
     }

     @GetMapping("/teacher_register")
     public String teacherRegister(){
        return "teacherRegister";
     }

     @GetMapping("/total_students")
    public ModelAndView  getAllStudents(){
        List<Student>list=service.getAllStudents();
        ModelAndView m=new ModelAndView();
        m.setViewName("studentList");
        m.addObject("student",list);
        return new ModelAndView("studentList","student",list);
    }
    @PostMapping("/save_Student")
    public String addStudent(@ModelAttribute Student b){
        service.save(b);
        return "redirect:/total_students";
    }

    @GetMapping("/total_teachers")
    public ModelAndView getAllTeachers(){
        List<Teacher> list=service.getAllTeachers();
        ModelAndView t=new ModelAndView();
        t.setViewName("teacherList");
        t.addObject("teacher",list);
        return new ModelAndView("teacherList","teacher",list);
    }
    @PostMapping("/save_Teacher")
    public String addTeacher(@ModelAttribute Teacher t){
        service.save(t);
        return "redirect:/total_teachers";
    }

    @RequestMapping("/editStudents/{id}")
    public String editStudents(@PathVariable("id") int id, Model model){
        Student b = service.getStudentById(id);
        model.addAttribute("student",b);
        return "studentEdit";
    }

    @GetMapping(value = "/deleteStudents/{id}")
    public String deleteStudents(@PathVariable("id") int id){
        service.deleteStudents(id);
        return "redirect:/total_students";
    }

    @RequestMapping("/editTeachers/{id}")
    public String editTeachers(@PathVariable("id")int id, Model model){
        Teacher t = service.getTeacherById(id);
        model.addAttribute("teacher",t);
        return "teacherEdit";
    }


    @GetMapping(value = "/deleteTeachers/{id}")
    public String deleteTeachers(@PathVariable("id") int id){
        service.deleteTeachers(id);
        return "redirect:/total_teachers";
    }

    @RequestMapping("/your_notes")
        public String index() {
            return "uploadNotes"; // This will render the upload.html page (see step 3)
        }


    }







