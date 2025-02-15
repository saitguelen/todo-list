package com.sait.todo.service;

import com.sait.todo.model.Task;
import com.sait.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    // Tüm görevleri getir (READ)
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Yeni görev oluştur (CREATE)
    public Task createTask(Task task) {
        return repository.save(task);
    }

    // Görevi güncelle (UPDATE)
    public Task updateTask(Long id, Task taskDetails) {
        Task task = repository.findById(id).orElseThrow();
        task.setTitle(taskDetails.getTitle());
        task.setCompleted(taskDetails.isCompleted());
        return repository.save(task);
    }

    // Görevi sil (DELETE)
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
