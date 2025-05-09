package com.example.HouseRental;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class HouseRental {

    List<House> houses = new ArrayList<House>();

    public HouseRental() {
        House house = new House(1,"123 Main St", 3, 1500);
        houses.add(house);
        house = new House(2, "456 Oak Ave", 4, 2000);
        houses.add(house);
        house = new House(3, "789 Pine Rd", 2, 1200);
        houses.add(house);
    }

    @GetMapping("/")
    public ResponseEntity<Void> home() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/index.html");
        return new ResponseEntity<>(headers, HttpStatus.FOUND); // HTTP 302 Redirect
    }

    @GetMapping("/houses")
    public List<House> getHouses() {
        return houses;
    }

    @GetMapping("/houses/{id}")
    public House aHouse(@PathVariable("id") int id) throws Exception {
        for (House house : houses) {
            if (house.getId()==id) {
                return house;
            }
        }
        return null;
    }

    @PutMapping(value = "/houses/{id}")
    public void rent(
            @PathVariable("id") int id,
            @RequestParam(value = "rent", required = true) boolean rent) throws Exception {

        House house = this.aHouse(id);
        if (house != null) {
            house.setRented(rent);
        }
    }
}
