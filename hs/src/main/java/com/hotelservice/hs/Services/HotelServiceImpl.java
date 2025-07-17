package com.hotelservice.hs.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.hs.Entities.Hotel;
import com.hotelservice.hs.ExceptionHandling.ResourceNotFoundException;
import com.hotelservice.hs.Repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired 
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String randomId = UUID.randomUUID().toString();
        hotel.setId(randomId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found !!"));
    }
    

}
