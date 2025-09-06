package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.example.todo.util.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    private long id;
    private String title;
    private String desc;
    private Status status;
    private LocalDate dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
