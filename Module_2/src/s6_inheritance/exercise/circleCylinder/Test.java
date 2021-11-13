package s6_inheritance.exercise.circleCylinder;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir);
        System.out.println("Area of circle : " + cir.getArea());

        Circle cylinder = new Cylinder(3,"blue",10);
        System.out.println(cylinder);
        System.out.println("Area of cylinder " + cylinder.getArea());
    }
}
