package com.cydeo.service;

import com.cydeo.database.Database;

import com.cydeo.entity.Student;

import java.util.*;

import static com.cydeo.database.Database.studentList;

public class StudentService implements CRUDService<Student> {
    @Override
    public Student findById(int id)  {

        return Database.studentList.stream()
                .filter(student -> student.getId() == id)
                .findAny().orElseThrow(()->new NoSuchElementException("No such Id exist"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentList);
    }

    @Override
    public void save(Student student) {
       studentList.add( student);

    }
    @Override
    public void update(Student student) {

        for (int i = 0; i < studentList.size(); i++) {
           if( studentList.get(i).getId()==student.getId()){
               studentList.set(i, student);
           }

        }
    }
    @Override
    public void deleteById(int id) {
        studentList.removeIf(student -> student.getId()==id);

    }
}
