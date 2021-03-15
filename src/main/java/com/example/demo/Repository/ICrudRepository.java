package com.example.demo.Repository;

import java.util.List;

public interface ICrudRepository<T> {

    public void create(T t);

    public T read(long id);

    public List<T> readAll();

    public void update(T t);

    public void delete(long id);

}