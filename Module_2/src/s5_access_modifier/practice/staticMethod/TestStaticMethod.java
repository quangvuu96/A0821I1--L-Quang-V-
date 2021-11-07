package s5_access_modifier.practice.staticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Quang Vũ");
        Student student2 = new Student(2, "Việt Nam");
        Student student3 = new Student(3, "Bảo Trâm");

        student1.display();
        student2.display();
        student3.display();
    }
}
