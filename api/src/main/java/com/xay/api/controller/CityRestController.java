package com.xay.api.controller;

import com.xay.api.dao.model.City;
import com.xay.api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaogc
 * on 2018/1/28.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;


    @GetMapping(value = "/api/city/{id}")
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @PostMapping(value = "/api/city")
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @PutMapping(value = "/api/city")
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @DeleteMapping(value = "/api/city/{id}")
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
    @PostMapping(value = "/api/city/list")
    public Object list(@RequestBody City city){
       return cityService.findAll();
    }
}

