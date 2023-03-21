package org.weCanCodeIT;

public interface Exercise {

    public String move();
    //example of abstraction, both types of exercise move something, weightlifting move weight, and cardio moves body
    //they are both exercise but have different categories

    public int intensity();


}


//Exercise Tracker
//Cardio vs weightlifting
//Upper body vs lower body
//Push vs Pull
//Example:
//squat is a weightlifting lower body pushing movement
//rowing is a cardio upper body pulling movement
//
//Abstraction = exercises that can all have different values and function
//polymorphism = when exercise asks for movement a squat will push and a row will pull
//encapsulation = an exercise could contain a HR tracker to evaluate intensity
//inheritance = a squat will inherit the behaviors of an upper body lift