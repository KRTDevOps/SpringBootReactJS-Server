package com.krtdevops.springbootreactjsdemo.service;

import java.util.List;

import com.krtdevops.springbootreactjsdemo.model.Student;

/**
 * @author KRTDevOps
 */

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
