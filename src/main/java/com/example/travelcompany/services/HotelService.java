package com.example.travelcompany.services;

import com.example.travelcompany.db.entity.Hotel;
import com.example.travelcompany.db.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService extends AbstractCrudService<Hotel, Long>
        implements CrudService<Hotel, Long>{

    private final HotelRepository repository;

    public HotelService(
            HotelRepository repository
    ) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public List<Hotel> findAll(){
        return repository.findAll();
    }
}
