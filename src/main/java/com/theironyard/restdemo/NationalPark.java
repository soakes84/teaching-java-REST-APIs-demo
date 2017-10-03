package com.theironyard.restdemo;

public class NationalPark {

    public String name;
    public String state;
    public boolean campable;

    public NationalPark(String name, String state, boolean campable) {
        this.name = name;
        this.state = state;
        this.campable = campable;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isCampable() {
        return campable;
    }

    public void setCampable(boolean campable) {
        this.campable = campable;
    }

    @Override
    public String toString() {
        return "NationalPark{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", campable=" + campable +
                '}';
    }
}
