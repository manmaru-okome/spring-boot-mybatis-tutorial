package com.example.todo.repository;

import com.example.todo.domain.Task;
import com.example.todo.repository.mybatis.TaskMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    private final SqlSessionTemplate sqlSessionTemplate;

    public TaskRepositoryImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Task> findList(String title, String userName) {
        return this.sqlSessionTemplate.getMapper(TaskMapper.class).find(title, userName);
    }
}
