package s4_class_and_object.exercise.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setIsOn(boolean on) {
        this.isOn = on;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public Fan() {
    }

    public String toString() {
        if (this.isOn = true)
            return "fan is on, speed : " + this.speed + " , color : " + this.color + " , radius : " + this.radius;
        else
            return "fan is of, color : " + this.color + " , radius : " + this.radius;
    }
}
