package s7_abtract_class_interface.exercise.resizeable;

public class Test {
    public static void main(String[] args) {
        IResizeable[] resizeables = new IResizeable[3];
        resizeables[0] = new Circle("black", false, 5.0);
        resizeables[1] = new Rectangle("yellow", true, 5.0,6.0);
        resizeables[2] = new Square(4.0);

        for (IResizeable resizeable : resizeables) {
            if(resizeable instanceof Circle) {
                resizeable.resize(50);
                System.out.println(resizeable);
            } else if(resizeable instanceof Rectangle) {
                resizeable.resize(50);
                System.out.println(resizeable);
            } else if(resizeable instanceof Square) {
                resizeable.resize(50);
                System.out.println(resizeable);
            }
        }
    }
}
