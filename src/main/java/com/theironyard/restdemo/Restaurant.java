package com.theironyard.restdemo;

public class Restaraunt {

    public String name;
    public String type;
    public double avgPrice;

    public Restaraunt(String name, String type, double avgPrice) {

        this.name = name;
        this.type = type;
        this.avgPrice = avgPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    @Override
    public String toString() {
        return "Restaraunt{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avgPrice=" + avgPrice +
                '}';
    }
}
