package com.example.todo.service;

import com.example.todo.dto.TaskRequestDTO;
import com.example.todo.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskByID(long id);

    Task createTask(TaskRequestDTO taskRequestDTO);

    Task updateTask(TaskRequestDTO taskRequestDTO);

    long deleteTask(long id);
}
