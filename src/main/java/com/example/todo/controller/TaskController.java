package com.example.todo.controller;

import com.example.todo.dto.TaskRequestDTO;
import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import com.example.todo.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        /*return List.of(
                new Task(1L,"Task","Desc", Status.PENDING,
                        LocalDate.now(), LocalDateTime.now(), LocalDateTime.now())
        );*/
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        /*return new Task(1L,"Task","Desc", Status.PENDING,
                LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());*/

        return taskService.getTaskByID(id);
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody TaskRequestDTO taskRequestDTO) {
        return taskService.createTask(taskRequestDTO);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable long id, @RequestBody TaskRequestDTO taskRequestDTO) {
        return taskService.updateTask(taskRequestDTO);
    }

    @DeleteMapping("/tasks/{id}")
    public long deleteTask(@PathVariable long id) {
        return taskService.deleteTask(id);
    }
}
