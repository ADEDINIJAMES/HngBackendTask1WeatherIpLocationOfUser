package com.example.HNGBackendTask1.pojo;

public class Location {
    private String status;
    private String country;
    private String regionName;
    private String city;
    private double lat;
    private double lon;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Location(String status, String country, String regionName, String city, double lat, double lon) {
        this.status = status;
        this.country = country;
        this.regionName = regionName;
        this.city = city;
        this.lat = lat;
        this.lon = lon;
    }

    public Location() {
    }
}
