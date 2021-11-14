package s7_abtract_class_interface.exercise.colorable;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A circle with radius : " + getRadius() +
                ", which is a subclass of " +
                super.toString();
    }
    @Override
    public void howToColor() {
        System.out.println(" Color all four sides is: "+ getColor());
    }
}
