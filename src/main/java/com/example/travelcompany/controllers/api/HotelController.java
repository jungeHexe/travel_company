package com.example.travelcompany.controllers.api;

import com.example.travelcompany.db.entity.Hotel;
import com.example.travelcompany.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hotel")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(
            HotelService hotelService
    ) {
        this.hotelService = hotelService;
    }

    @GetMapping("")
    public List<Hotel> findHotels(){
        return hotelService.findAll();
    }

    @GetMapping("{id}")
    public Hotel findHotelById(@PathVariable Long id){
        return hotelService.findById(id).get();
    }

    @PutMapping("{id}")
    public Hotel updateHotelById(
            @PathVariable("id") Long id,
            String name,
            String link
    ){
        Hotel hotel = hotelService.findById(id).get();
        hotel.setName(name)
                .setLink(link);
        return hotelService.save(hotel);
    }

    @PostMapping("")
    public Hotel createHotel(
            String name,
            String link
    ){
        Hotel hotel = new Hotel();
        hotel.setName(name)
                .setLink(link);
        return hotelService.save(hotel);
    }

    @DeleteMapping("{id}")
    public void deleteHotelById(
            @PathVariable Long id
    ){
        hotelService.delete(findHotelById(id));
    }
}
