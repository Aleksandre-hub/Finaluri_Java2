package com.example.demo.controllers;

import com.example.demo.dtos.HotelsDto;
import com.example.demo.entities.Hotels;
import com.example.demo.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hotels")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {this.hotelService = hotelService; }

    @PostMapping("/add")
    public Hotels addBook(@RequestBody HotelsDto bookDto){
        return hotelService.addHotel(bookDto);
    }

}
