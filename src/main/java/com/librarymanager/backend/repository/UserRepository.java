package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUsersByUserId(Integer userId);

}
