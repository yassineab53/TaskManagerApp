package net.yassine.taskmanagerapp.services.Impl;
import net.yassine.taskmanagerapp.models.Task;

import net.yassine.taskmanagerapp.models.User;
import net.yassine.taskmanagerapp.repositories.TaskRepository;
import net.yassine.taskmanagerapp.repositories.UserRepository;
import net.yassine.taskmanagerapp.services.TaskService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    @Override
    public Task saveTask(Task task) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

//        User user = task.getUser();
//        if (user != null && user.getId() == null) {
//            // User is transient, so save or merge it
////            user = userRepository.save(user);
//            task.setUser(user);
//        }

        User user = userRepository.findByUsername(username).orElseThrow(() -> new IllegalArgumentException("User not found"));
        task
                .setUser(user);
        return taskRepository.save(task);
    }

    public List<Task> getTasksForCurrentUser() {
        // Get the username of the currently authenticated user
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        // Retrieve tasks for the current user
        return taskRepository.findByUserUsername(username);
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTask(Long id) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username).orElseThrow();
        Task task = taskRepository.findById(id).orElseThrow();

        if (task.getUser() == user)
            taskRepository.deleteById(id);
    }

    // Other service methods for task operations
}