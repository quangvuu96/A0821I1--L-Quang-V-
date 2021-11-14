package s7_abtract_class_interface.exercise.colorable;

public class Square  extends  Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square( String color, boolean filled, double side) {
        super(color, filled,side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    public void setHeight(double height) {
        setSide(height);
    }
    public String toString() {
        return "A square with side : " + getSide() +
                ", area = " + getArea() +
                ", which is a subclass of " + super.toString();
    }
}
