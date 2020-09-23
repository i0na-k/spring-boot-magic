package com.iona.DAO;
import com.iona.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {
    private static Map<Integer,Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1,  new Student(1, "Test", "Science"));
                put(2, new Student(2,"Test2","Physics"));
                put(3, new Student(3, "Test3","Blablabla"));
            }

        };

    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void deleteStudentById(int id){
        this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    public void addStudent(Student student){
        this.students.put(student.getId(),student);
    }

}
