package com.example.todo.service;

import com.example.todo.domain.TaskList;

public interface TaskService {
    TaskList find(String title, String userName);
}
