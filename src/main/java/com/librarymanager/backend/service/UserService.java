package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.UserDTO;
import com.librarymanager.backend.entity.User;
import com.librarymanager.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setRole(userDTO.getRole());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setEmailVerified(false);
        user.setVerificationToken(userDTO.getVerificationToken());
        userRepository.save(user);
    }
}
