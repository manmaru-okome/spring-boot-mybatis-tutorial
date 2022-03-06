package com.example.todo.domain;

import java.sql.Timestamp;

public class Task {
    private Integer taskId;

    private String title;

    private String description;

    private Timestamp createdAt;

    private User user;

    public Task() {};

    public Task(Integer taskId, String title, String description, Timestamp createdAt, User user) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.user = user;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

