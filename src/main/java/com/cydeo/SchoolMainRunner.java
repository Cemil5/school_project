package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;
import com.cydeo.service.CRUDService;
import com.cydeo.service.ParentService;

import com.cydeo.entity.Parent;
import com.cydeo.entity.Student;
import com.cydeo.service.CRUDService;
import com.cydeo.service.StudentService;

import com.cydeo.entity.Course;
import com.cydeo.enums.WeekDays;

import com.cydeo.service.CourseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.List;
import java.util.NoSuchElementException;

import static com.cydeo.database.Database.courseList;
import static com.cydeo.database.Database.parentList;

public class SchoolMainRunner{

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;

      public static CRUDService<Parent> parentService;
//    public static CRUDService<Student> studentService;
//
    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
        SchoolMainRunner.parentService = new ParentService();
//        SchoolMainRunner.studentService = new StudentService();
    System.out.println(parentService.findById(1));
    System.out.println(parentService.findAll());
     }

//    public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;
////
    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();







        Database.courseList.forEach(System.out::println);
        System.out.println("-------------------------------");
        //Course courseService = new CourseService().findById(0);
        //System.out.println(courseService);
       // System.out.println("-------------------------------");
       // List<Course> allCourse = new CourseService().findAll();
       // System.out.println(allCourse);

}

    public static void main(String[] args)  {

      //System.out.println(studentService.findAll());

//        System.out.println(studentService.findById(5));

      studentService.save(new Student(3,12345L, "Ali", "Roiesh", parentList.get(0), courseList));
        studentService.update(new Student(3, 423443L, "Hamid", "Karimi", parentList.get(1), courseList));
        studentService.deleteById(2);
        Database.studentList.forEach(System.out::println);





    }




        //CourseService obj = new CourseService();
        //obj.deleteById(1);

       // CourseService obj = new CourseService();
       //  obj.update(new Course(5,"CyberSecurity",80, List.of(WeekDays.WEDNESDAY)));


       //Database.courseList.forEach(System.out::println);


    }

}
