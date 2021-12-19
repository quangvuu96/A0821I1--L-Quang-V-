package s19_string_regex.exercise.validateClassroomName;

import java.util.Scanner;

public class ClassroomNameTest {
    private static ClassroomName classroomName;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        classroomName = new ClassroomName();
        System.out.println("Classroom name : ");
        String name = scanner.nextLine();
        while (!classroomName.validate(name)){
            System.out.println("Invalid!");
            System.out.println("Classroom name : ");
            name = scanner.nextLine();
            classroomName.validate(name);
        }
        System.out.println("Success");
    }
}
