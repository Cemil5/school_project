package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;
import com.cydeo.entity.Student;
import com.cydeo.service.CRUDService;
import com.cydeo.service.StudentService;

import java.util.List;

public class SchoolMainRunner{

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;
////
    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();
 //   System.out.println(studentService.findById(1));
 //   System.out.println(studentService.findAll());
        studentService.save(new Student(123451L, "Yasin", "Royesh", new Parent(3,"Reza", "Mo","6548655656"), Database.courseList) );

    }

    public static void main(String[] args) {

//        Student student3 = new Student();
//        System.out.println( student3.getLastName());

//        Database.courseList.forEach(System.out::println);
        Database.studentList.forEach(System.out::println);


    }



}
