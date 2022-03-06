package com.example.todo.repository.mybatis;

import com.example.todo.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskMapper {
    List<Task> find(@Param("title") String title, @Param("userName") String userName);

//    Task get();
//
//    Task lock();
//
//    int add(Task task);
//
//    int set(Task task);
//
//    int remove(Task task);

}

