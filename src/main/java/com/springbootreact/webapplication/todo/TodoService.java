package com.springbootreact.webapplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    // static initialization
    static {
        todos.add(new Todo(1, "user01", "learn aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "user01", "learn kafka", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "user03", "learn docker", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(4, "user03", "learn react", LocalDate.now().plusYears(2), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;

    }

}
