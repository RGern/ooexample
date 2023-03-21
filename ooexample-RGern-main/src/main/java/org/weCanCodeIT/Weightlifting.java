package org.weCanCodeIT;

abstract class Weightlifting implements Exercise{

    String weight = "weights";
    protected String category = "weightlifting";

    public String getWeight() {
        return weight;
    }


    @Override
    public String move() {
        return weight; //example of polymorphism, an exercise that will use move differently
    }


}
