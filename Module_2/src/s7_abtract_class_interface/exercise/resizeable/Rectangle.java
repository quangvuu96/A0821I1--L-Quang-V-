package s7_abtract_class_interface.exercise.resizeable;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }
    @Override
    public String toString() {
        return "A rectangle with width = " + getWidth() +
                ", height = " + getHeight() +
                ", area = " +  getArea() +
                ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        width*=percent/100;
        height*=percent/100;
    }
}
