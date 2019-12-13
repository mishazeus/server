package com.example.server.service;

import com.example.server.Admin;
import com.example.server.dao.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

 //   @Autowired
 //   private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(Admin admin) {
   //     admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
    }

    @Override
    public Admin findByLogin(String login) {
        return adminRepository.findByLogin(login);
    }
}
