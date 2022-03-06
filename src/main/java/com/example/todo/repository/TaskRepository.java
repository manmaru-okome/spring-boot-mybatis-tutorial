package com.example.todo.repository;

import com.example.todo.domain.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findList(String title, String userName);
}
