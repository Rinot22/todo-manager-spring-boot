package com.springboot.todo.service;

import com.springboot.todo.model.Todo;
import com.springboot.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements ITodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(Integer id) {
        return todoRepository.findById(id);
    }


    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todoRepository.save(new Todo(name, desc, targetDate, isDone));
    }


    @Override
    public void deleteTodo(Integer id) {
        Optional<Todo> todo = todoRepository.findById(id);
        todo.ifPresent(todoRepository::delete);
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
