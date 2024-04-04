package com.example.learning.springpractice;

public class Adress {

    private int street;
    private String city;
    private String state;

    public Adress() {
    }

    public Adress(int street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street=" + street +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
