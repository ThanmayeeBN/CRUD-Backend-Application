package com.tancoder.fullstackbackend.repository;

import com.tancoder.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
