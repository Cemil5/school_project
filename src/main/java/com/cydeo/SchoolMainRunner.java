package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;
import com.cydeo.enums.WeekDays;
import com.cydeo.service.CRUDService;
import com.cydeo.service.CourseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolMainRunner {

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
//    public static CRUDService<Student> studentService;
//
//    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
//        SchoolMainRunner.studentService = new StudentService();
//    }

    public static void main(String[] args) {

        Database.courseList.forEach(System.out::println);
        System.out.println("-------------------------------");
        //Course courseService = new CourseService().findById(0);
        //System.out.println(courseService);
       // System.out.println("-------------------------------");
       // List<Course> allCourse = new CourseService().findAll();
       // System.out.println(allCourse);




        //CourseService obj = new CourseService();
        //obj.deleteById(1);

       // CourseService obj = new CourseService();
       //  obj.update(new Course(5,"CyberSecurity",80, List.of(WeekDays.WEDNESDAY)));


       //Database.courseList.forEach(System.out::println);


    }

}
