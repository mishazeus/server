package com.example.server.service;

import com.example.server.Admin;

public interface AdminService {
    void save(Admin admin);

    Admin findByLogin(String login);
}
