package com.example.server;

import org.springframework.data.jpa.repository.JpaRepository;

interface AdminRepository extends JpaRepository<Admin, Integer> {

}
