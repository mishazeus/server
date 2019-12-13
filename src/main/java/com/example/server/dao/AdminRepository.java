package com.example.server.dao;

import com.example.server.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByLogin(String login);

    Admin findByPassword(String password);
}
