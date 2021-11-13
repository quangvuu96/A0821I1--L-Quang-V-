package s6_inheritance.exercise.pointMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(3,6,9,12);
        System.out.println(moveablePoint);
    }
}
