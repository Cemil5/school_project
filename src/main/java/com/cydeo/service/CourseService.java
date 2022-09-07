package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class CourseService implements CRUDService<Course> {

    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId() == id)
                .findFirst().orElseThrow();
    }

    @Override
    public List<Course> findAll() {
        return Database.courseList;
    }

    @Override
    public void save(Course course) {
        Database.courseList.add(course);

    }

    @Override
    public void update(Course course) {
        deleteById(course.getId());
        Database.courseList.add(course);
        Database.courseList
                .sort(comparing((Course course1) -> course1.getId()));
    }

    @Override
    public void deleteById(int id) {
        boolean isDeleted = Database.courseList.removeIf(p -> p.id == id);
        if (!isDeleted) {
            throw new NoSuchElementException();
        }
    }
}