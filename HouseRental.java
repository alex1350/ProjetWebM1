// package com.example.masterSecu;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class HouseRental {

    List<House> houses = new ArrayList<House>();

    public HouseRental() {
        House house = new House("123 Main St", 3, 1500);
        houses.add(house);
        house = new House("456 Oak Ave", 4, 2000);
        houses.add(house);
        house = new House("789 Pine Rd", 2, 1200);
        houses.add(house);
    }

    @GetMapping("/houses")
    public List<House> getHouses() {
        return houses;
    }

    @GetMapping("/houses/{address}")
    public House aHouse(@PathVariable("address") String address) throws Exception {
        for (House house : houses) {
            if (house.getAddress().equals(address)) {
                return house;
            }
        }
        return null;
    }

    @PutMapping(value = "/houses/{address}")
    public void rent(
            @PathVariable("address") String address,
            @RequestParam(value = "rent", required = true) boolean rent) throws Exception {

        House house = this.aHouse(address);
        if (house != null) {
            house.setRented(rent);
        }
    }
}
