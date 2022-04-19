package com.example.travelcompany.services;

import com.example.travelcompany.db.entity.Country;
import com.example.travelcompany.db.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService extends AbstractCrudService<Country, Long>
    implements CrudService<Country, Long>{

    private final CountryRepository repository;

    public CountryService(
            CountryRepository repository
    ) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public List<Country> findAll(){
        return repository.findAll();
    }
}
