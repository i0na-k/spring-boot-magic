package com.iona.Service;

import com.iona.DAO.StudentDAO;
import com.iona.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public void deleteStudentById(int id){
        this.studentDao.deleteStudentById(id);
        System.out.println("Student deleted!");
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
        System.out.println(student.getName() + ":Student updated!");
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
        System.out.println(student.getName() + ":Student added!");
    }
}
