package com.example.android.quakereport;

public class earthquakcustomclass {

    private double mag;
    private String city;
    private long date;
    private String Location;

    public earthquakcustomclass(double mag, String city, long date, String location) {
        this.mag = mag;
        this.city = city;
        this.date = date;
        Location = location;
    }



    public double getMag() {
        return mag;
    }

    public String getCity() {
        return city;
    }

    public long getDate() {
        return date;
    }

    public String getLocation() {
        return Location;
    }
}
