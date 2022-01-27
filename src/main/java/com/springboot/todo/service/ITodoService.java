package com.springboot.todo.service;

import com.springboot.todo.model.Todo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ITodoService {
    List<Todo> getTodosByUser(String user);

    Optional<Todo> getTodoById(int id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(int id);

    void saveTodo(Todo todo);
}
