package com.example.projectreview.goslingfurni.repository;
import com.example.projectreview.goslingfurni.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepo extends JpaRepository<Order, Integer> {
}