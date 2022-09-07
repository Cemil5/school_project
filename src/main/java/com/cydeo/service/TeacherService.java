package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements CRUDService<Teacher>{


    @Override
    public Teacher findById(int id) {
        return Database.teacherList.stream().filter(p -> p.getId()==id)
            .findAny().get();
    }

    @Override
    public List findAll() {
        return new ArrayList(Database.teacherList);
    }

    @Override
    public void save(Teacher teacher) {

    }

    @Override
    public void update(Teacher teacher) {
 /*  for (int i = 0; i < Database.teacherList.size(); i++) {
            if (Database.teacherList.get(i).getId() == teacher.getId()) {
                Database.teacherList.set(i, course);
try to add it

            }
        }*/
    }

    @Override
    public void deleteById(int id) {
   // change
        // more changes
    }
}
