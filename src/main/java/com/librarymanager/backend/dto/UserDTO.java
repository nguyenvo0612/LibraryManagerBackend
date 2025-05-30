package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {
    private String username;
    private String email;
    private String password;
    private String verificationToken;
    private Role role;
}
