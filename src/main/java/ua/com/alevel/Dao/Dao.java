package ua.com.alevel.Dao;

import ua.com.alevel.model.User;

import java.util.List;

public interface Dao<T> {
    void create(T model);


    T update(T model);

    T findById(int id);

    List<T> findAll();

    boolean deleteById(int id);
}
