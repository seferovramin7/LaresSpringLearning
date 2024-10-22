package com.ltc.laresspringlearning.dto;

public class Rating {
    public double average;
    public int reviews;

    public Rating(double average, int reviews) {
        this.average = average;
        this.reviews = reviews;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
