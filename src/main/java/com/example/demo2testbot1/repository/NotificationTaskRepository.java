package com.example.demo2testbot1.repository;

import com.example.demo2testbot1.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository <NotificationTask,Long>{

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
    List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime,long chatId);

}
