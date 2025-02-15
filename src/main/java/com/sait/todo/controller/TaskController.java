package com.sait.todo.controller;

import com.sait.todo.model.Task;
import com.sait.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // Tüm görevleri getir (READ)
    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    // Yeni görev oluştur (CREATE)
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    // Görevi güncelle (UPDATE)
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return service.updateTask(id, taskDetails);
    }

    // Görevi sil (DELETE)
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
