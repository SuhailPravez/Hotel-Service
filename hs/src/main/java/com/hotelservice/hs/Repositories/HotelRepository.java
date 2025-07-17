package com.hotelservice.hs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelservice.hs.Entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String>{
    
}
