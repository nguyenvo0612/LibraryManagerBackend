package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
    Notification getNotificationsByNotificationId(Integer notificationId);
}
