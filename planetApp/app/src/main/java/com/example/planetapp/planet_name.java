package com.example.planetapp;

import android.widget.TextView;

public class planet_name {
    private String planetName;
    private String moonCount;
    private int planetImage;

    //constructor to assign values
    public planet_name(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //getter and setter
    // getter is to return the value which is defined by private access modifier
    // setter is to assign the value which is defined by private access modifier

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
