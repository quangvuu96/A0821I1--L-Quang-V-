package s6_inheritance.exercise.circleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return getRadius()*2*height*Math.PI;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cylinder : " +
                "height = " + height ;
    }
}
