package com.example.projectreview.goslingfurni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectreview.goslingfurni.model.*;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}