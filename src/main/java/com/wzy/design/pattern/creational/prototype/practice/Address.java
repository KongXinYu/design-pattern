package com.wzy.design.pattern.creational.prototype.practice;

import java.io.Serializable;

/**
 * @author: WuZY
 * @time: 2021/05/19
 */
public class Address implements Serializable {

    private String country;

    private String province;

    private String city;

    private String distrit;

    private String detail;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrit() {
        return distrit;
    }

    public void setDistrit(String distrit) {
        this.distrit = distrit;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
