package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void squatTest() { //example of inheritance extending an abstract class
        Squat squat = new Squat( "lower body", "push", new Load(200));
        assertEquals("weightlifting", squat.getCategory()); //example of polymorphism
        assertEquals("lower body", squat.getType());
        assertEquals("push", squat.getQuality());
        assertEquals("weights", squat.getWeight());
        assertEquals( 200,squat.getLoad()); //example of encapsulation

    }

    @Test
    void backSquatTest() { //example of inheritance extending a concrete class
        BackSquat backSquat = new BackSquat( "lower body", "push", new Load(300));
        assertEquals("weightlifting", backSquat.getCategory());
        assertEquals("lower body", backSquat.getType());
        assertEquals("push", backSquat.getQuality());
        assertEquals("weights", backSquat.getWeight());
        assertEquals("back", backSquat.getWeightLocation());
        assertEquals( 300, backSquat.getLoad()); //example of encapsulation
    }

    @Test
    void runningTest() {
        Run run = new Run( "lower body", "push", new HRTracker(100));
        assertEquals("cardio", run.getCategory()); //example of polymorphism
        assertEquals("lower body", run.getType());
        assertEquals("push", run.getQuality());
        assertEquals("body", run.getBody());
        assertEquals(100, run.getHeartRate()); //example of encapsulation
    }
    @Test
    void rowingTest() {
        Row row = new Row( "lower body", "push", new HRTracker(100));
        assertEquals("cardio", row.getCategory()); //example of polymorphism
        assertEquals("lower body", row.getType());
        assertEquals("push", row.getQuality());
        assertEquals("body", row.getBody());
        assertEquals(100, row.getHeartRate()); //example of encapsulation
    }


}