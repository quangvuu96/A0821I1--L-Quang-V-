package s4_class_and_object.exercise.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double root1;
        if (getDiscriminant() >= 0) {
            root1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / (this.a * 2);
            return root1;
        }
        return 0;
    }

    public double getRoot2() {
        double root2;
        if (getDiscriminant() >= 0) {
            root2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / (this.a * 2);
            return root2;
        }
        return 0;
    }
}
