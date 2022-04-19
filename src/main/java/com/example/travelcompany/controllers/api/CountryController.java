package com.example.travelcompany.controllers.api;

import com.example.travelcompany.db.entity.Country;
import com.example.travelcompany.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/country")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(
            CountryService countryService
    ) {
        this.countryService = countryService;
    }

    @GetMapping("")
    public List<Country> findCountries(){
        return countryService.findAll();
    }

    @GetMapping("{id}")
    public Country findCountryById(@PathVariable Long id){
        return countryService.findById(id).get();
    }

    @PutMapping("{id}")
    public Country updateCountryById(
            @PathVariable("id") Long id,
            String name,
            String image,
            Integer rating
    ){
        Country country = countryService.findById(id).get();
        country.setName(name)
                .setImage(image)
                .setRating(rating);
        return countryService.save(country);
    }

    @PostMapping("")
    public Country createCountry(
            String name,
            String image,
            Integer rating
    ){
        Country country = new Country();
        country.setName(name)
                .setImage(image)
                .setRating(rating);
        return countryService.save(country);
    }

    @DeleteMapping("{id}")
    public void deleteCountryById(
            @PathVariable Long id
    ){
        countryService.delete(findCountryById(id));
    }
}
