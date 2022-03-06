package com.example.todo.controller;

import com.example.todo.domain.TaskList;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public TaskList find(
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "userName", required = false) String userName
    ) {
        return this.service.find(title, userName);
    }
}
