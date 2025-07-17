package com.hotelservice.hs.Services;

import java.util.List;

import com.hotelservice.hs.Entities.Hotel;

public interface HotelService {
    
    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotel(String id);
}
