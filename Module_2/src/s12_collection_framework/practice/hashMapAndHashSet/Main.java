package s12_collection_framework.practice.hashMapAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vũ", 22, "ĐN");
        Student student2 = new Student("Trâm", 20, "ĐN");
        Student student3 = new Student("Tủm", 18, "QN");

        Map<Integer, Student> student = new HashMap<Integer, Student>();
        student.put(1,student1);
        student.put(2,student2);
        student.put(3,student3);

        for (Map.Entry<Integer, Student> x : student.entrySet()) {
            System.out.println(x.toString());
        }
        System.out.println("............Set");

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        for (Student y : studentSet) {
            System.out.println(y.toString());
        }
    }
}
