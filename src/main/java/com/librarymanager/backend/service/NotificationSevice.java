package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.NotificationDTO;
import com.librarymanager.backend.entity.Notification;
import com.librarymanager.backend.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationSevice {
    @Autowired
    private NotificationRepository notificationRepository;

    private void addNotification(NotificationDTO notificationDTO) {
        Notification notification = new Notification();
        notification.setMessage(notificationDTO.getMessage());
        notificationRepository.save(notification);
    }

    private void deleteNotificationById(Integer notificationId) {
        notificationRepository.deleteById(notificationId);
    }

    private Notification findNotificationById(Integer notificationId) {
        return notificationRepository.getNotificationsByNotificationId(notificationId);
    }
}
