package com.example.todo.service;

import com.example.todo.domain.TaskList;
import com.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }
    @Override
    public TaskList find(String title, String userName) {
        TaskList taskList = new TaskList();
        taskList.setTaskList(this.repository.findList(title, userName));
        return taskList;
    }

}
