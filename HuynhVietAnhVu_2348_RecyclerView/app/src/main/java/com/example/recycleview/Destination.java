package com.example.recycleview;

public class Destination {
    private String name;
    private String location;
    private String duration;
    private String activities;
    private String price;
    private double rating;
    private int imageResource;

    public Destination(String name, String location, String duration,
                       String activities, String price, double rating, int imageResource) {
        this.name = name;
        this.location = location;
        this.duration = duration;
        this.activities = activities;
        this.price = price;
        this.rating = rating;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDuration() {
        return duration;
    }

    public String getActivities() {
        return activities;
    }

    public String getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getImageResource() {
        return imageResource;
    }
}