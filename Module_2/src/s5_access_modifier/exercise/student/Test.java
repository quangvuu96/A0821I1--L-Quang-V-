package s5_access_modifier.exercise.student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.setName("Vu");
        stu1.setClasses("A0821I1");
        stu2.setName("Quoc");
        stu2.setClasses("A0821I2");

        System.out.println("Student 1 : " + stu1.getName() + " ,class : " + stu1.getClasses());
        System.out.println("Student 2 : " + stu2.getName() + " ,class : " + stu2.getClasses());
    }
}
