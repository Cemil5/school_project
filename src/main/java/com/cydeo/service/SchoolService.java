package com.cydeo.service;

import com.cydeo.entity.School;

import java.util.List;
import java.util.stream.Collectors;

import static com.cydeo.database.Database.schoolList;

public class SchoolService implements CRUDService<School> {


    @Override
    public School findById(int id) {
        return schoolList.stream().filter(school -> school.getId()==id).findAny().get();
    }

    @Override
    public List<School> findAll() {
        return schoolList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(School school) {
     schoolList.add(school);

    }

    @Override
    public void update(School school) {

        for (int i = 0; i < schoolList.size(); i++) {
            if ( schoolList.get(i).getId()== school.getId()){
               schoolList.set(i,school);
            }

        }

    }

    @Override
    public void deleteById(int id) {
        schoolList.removeIf(school -> school.getId()==id);


//        for (int i = 0; i <schoolList.size(); i++) {
//            if(schoolList.get(i).getId()==id)schoolList.remove(i); notes

        }

    }

