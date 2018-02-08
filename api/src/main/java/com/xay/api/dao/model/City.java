package com.xay.api.dao.model;

import javax.persistence.*;

@Table(name = "city")
public class City {
    /**
     * 城市编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省份编号
     */
    @Column(name = "province_id")
    private Integer provinceId;

    /**
     * 城市名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取城市编号
     *
     * @return id - 城市编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置城市编号
     *
     * @param id 城市编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省份编号
     *
     * @return province_id - 省份编号
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省份编号
     *
     * @param provinceId 省份编号
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取城市名称
     *
     * @return city_name - 城市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置城市名称
     *
     * @param cityName 城市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}