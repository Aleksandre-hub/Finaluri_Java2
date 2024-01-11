package com.example.demo.services;

import com.example.demo.dtos.HotelsDto;
import com.example.demo.entities.Hotels;
import com.example.demo.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Hotels addHotel(HotelsDto hotelDto){
        Hotels hotel = new Hotels(hotelDto);
        return HotelRepository.save(hotel);

    }

}
