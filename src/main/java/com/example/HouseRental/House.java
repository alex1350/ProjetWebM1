package com.example.HouseRental;

public class House {
    
    int id; 
    String address;
    int numberOfRooms;
    int price;
    boolean rented;

    public House(int id,String address, int numberOfRooms, int price) {
        this.id = id;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public House() {
    }

    public int getId(){
        return id;
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
