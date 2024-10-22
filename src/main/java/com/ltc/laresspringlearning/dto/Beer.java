package com.ltc.laresspringlearning.dto;

public class Beer {
    public String price;
    public String name;
    public Rating rating;
    public String image;
    public int id;

    public Beer(String price, String name, Rating rating, String image, int id) {
        this.price = price;
        this.name = name;
        this.rating = rating;
        this.image = image;
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
