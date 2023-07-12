package com.example.demo2testbot1.service;

import com.example.demo2testbot1.entity.NotificationTask;
import com.example.demo2testbot1.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }
    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);
    }
}
