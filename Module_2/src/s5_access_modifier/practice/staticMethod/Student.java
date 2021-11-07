package s5_access_modifier.practice.staticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college= "DUT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // static method to change the value of static variable
    static void change() {
        college = "BACH KHOA";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
