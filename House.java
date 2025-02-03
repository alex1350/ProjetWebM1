// package com.example.masterSecu;

public class House {

    String address;
    int numberOfRooms;
    int price;
    boolean rented;

    public House(String address, int numberOfRooms, int price) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public House() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
