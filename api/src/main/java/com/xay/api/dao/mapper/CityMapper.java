package com.xay.api.dao.mapper;

import com.xay.api.dao.model.City;
import com.xay.api.util.MyMapper;
import tk.mybatis.mapper.common.Mapper;

public interface CityMapper extends MyMapper<City> {
    City findById(Long id);
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}