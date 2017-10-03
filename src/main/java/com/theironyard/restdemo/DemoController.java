package com.theironyard.restdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    List<String> animals = new ArrayList<>();            //simple example
    List<NationalPark> parks = new ArrayList<>();
    List<Restaraunt> restaraunts = new ArrayList<>();

    @RequestMapping(path = "/api/animals", method = RequestMethod.GET)  //Just showing how to hit a route
    public List<String> getAnimals() {                                  //builds a simple list to show
        List<String> animals = this.buildAnimals();
        return animals;
    }

    @RequestMapping(path = "/api/parks", method = RequestMethod.GET) //Simple example of hitting a route based on a class
    public List<NationalPark> getParks() {
        List<NationalPark> parks = this.buildParks();
        return parks;
    }

    @RequestMapping(path = "/api/restaraunts", method = RequestMethod.GET) //One more simple example
    public List<Restaraunt> getRestaraunts() {
        List<Restaraunt> restaraunts = this.buildRestaraunts();

        return restaraunts;
    }


    private List buildAnimals () {

        animals.add("River Otter");
        animals.add("Moose");
        animals.add("Aye-aye Lemur");
        animals.add("Blue Whale");
        animals.add("Kitty");
        animals.add("Flying Monkey");


        return animals;
    }

    private List buildParks() {
        parks.add(new NationalPark("Olympic", "Washington", true));
        parks.add(new NationalPark("Grand Canyon", "Arizona", true));
        parks.add(new NationalPark("Acadia", "Maine", true));
        parks.add(new NationalPark("Biscayne", "Florida", false));
        parks.add(new NationalPark("Congaree", "South Carolina", true));
        parks.add(new NationalPark("Mars", "Space", false));

        return parks;
    }

    private List buildRestaraunts () {
        restaraunts.add(new Restaraunt("Wild Olive", "Italian", 22));
        restaraunts.add(new Restaraunt("Sunrise Bistro", "Brunch", 10));
        restaraunts.add(new Restaraunt("Wasabi", "Asian", 14));
        restaraunts.add(new Restaraunt("Tattooed Moose", "American", 12));

        return restaraunts;
    }
}
