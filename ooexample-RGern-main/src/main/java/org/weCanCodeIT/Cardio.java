package org.weCanCodeIT;

abstract class Cardio implements Exercise {

    public String getBody() {
        return body;
    }

    String body = "body";
    protected String category= "cardio";
    @Override
    public String move() {
        return body;
    }

}
