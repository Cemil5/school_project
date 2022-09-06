package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static com.cydeo.database.Database.parentList;
import static com.cydeo.database.Database.schoolList;

public class ParentService implements CRUDService<Parent> {
    @Override
    public Parent findById(int id) {
        return parentList.stream().filter(parent -> parent.getId() == id)
                .findAny().get();
    }

    @Override
    public List<Parent> findAll() {
        return parentList;
    }

    @Override
    public void save(Parent parent) {
        parentList.add(parent);
    }

    @Override
    public void update(Parent parent) {
        for (int i = 0; i < parentList.size(); i++) {
            if (parentList.get(i).getId() == parent.getId()) {
                parentList.set(i, parent);
            }
        }
    }

    @Override
    public void deleteById(int id) {
        parentList.removeIf(p -> p.getId() == id);
    }
}
