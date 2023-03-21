package org.weCanCodeIT;

public class BackSquat extends Squat{
    public BackSquat( String type, String quality, Load Load) {
        super(type, quality, Load);
    }

    //this extends the concrete class squat and adds some functionality
    public String getWeightLocation() {
        return weightLocation;
    }

    String weightLocation = "back";



}
