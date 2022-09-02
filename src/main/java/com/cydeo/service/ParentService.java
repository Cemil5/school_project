package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParentService implements CRUDService<Parent>{
    @Override
    public Parent findById(int id) {
        return Database.parentList.stream().filter(parent -> parent.getId()==id)
                .findAny().get();
    }

    @Override
    public List<Parent> findAll() {
        return new ArrayList<>(Database.parentList);

    }

    @Override
    public void save(Parent parent) {

    }

    @Override
    public void update(Parent parent) {

    }

    @Override
    public void deleteById(int id) {

    }
}
