package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDTO {
    private String message;
    private Boolean seen;
    private User user;
}
