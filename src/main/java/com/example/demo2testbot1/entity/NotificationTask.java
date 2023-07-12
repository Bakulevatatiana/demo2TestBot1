package com.example.demo2testbot1.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="notification_task")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String message;
    @Column(name="chat_id",nullable = false)
    private long chatId;
    @Column(name="notification_date_time",nullable = false)
    private LocalDateTime notificationDateTime;

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }
    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public long getChatId() {
        return chatId;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }
}



