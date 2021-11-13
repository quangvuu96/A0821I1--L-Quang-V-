package s6_inheritance.exercise.designTriangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
