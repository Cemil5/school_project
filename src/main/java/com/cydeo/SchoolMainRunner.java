package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;
import com.cydeo.service.CRUDService;
import com.cydeo.service.ParentService;

public class SchoolMainRunner {

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


    public static void main(String[] args) {


        Database.courseList.forEach(System.out::println);


    }


}
