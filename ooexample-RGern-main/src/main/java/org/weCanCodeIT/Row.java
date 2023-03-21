package org.weCanCodeIT;

public class Row extends Cardio {
    //inheritance, this class will inherit the move "body" from cardio
    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return quality;
    }

    public int getHeartRate() {
        return hrTracker.heartRate;
    }

    private String type;
    private String quality;
    private HRTracker hrTracker;


    public Row(String type, String quality, HRTracker hrTracker) {

        this.type = type;
        this.quality = quality;
        this.hrTracker = hrTracker;
    }

    @Override
    public int intensity() {
        return hrTracker.heartRate;
    }
}