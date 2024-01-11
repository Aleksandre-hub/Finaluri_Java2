package com.example.demo.repositories;

import com.example.demo.entities.Hotels;
import com.example.demo.entities.RecordState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotels, Long>{

}
