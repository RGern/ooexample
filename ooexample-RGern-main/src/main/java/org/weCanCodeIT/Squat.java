package org.weCanCodeIT;

public class Squat extends Weightlifting{
//this extends the abstract class weightlifting and adds some functionality
    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return quality;
    }



    private String type;
    private String quality;
    private Load load;

    public int getLoad() {
        return load.weight;
    }



    public Squat(String type, String quality, Load load) {

        this.type = type;
        this.quality = quality;
        this.load = load;

    }

    @Override
    public int intensity() {
        return load.weight;
    }
}
