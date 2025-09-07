package com.example.todo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskRequestDTO {
    private String title;
    private String desc;
    private LocalDate dueDate;
}
