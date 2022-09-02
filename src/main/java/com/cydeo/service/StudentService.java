package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;
import com.cydeo.entity.Parent;
import com.cydeo.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements CRUDService<Student> {


    @Override
    public Student findById(int id) {
        return Database.studentList.stream()
                .filter(student -> student.getId()==id)
                .findAny().get();
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(Database.studentList);
    }

    @Override
    public void save(Student student) {
       Database.studentList.add( student);


    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(int id) {

    }
}
