package s17_io_binary_file_serialization.practice.readAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Lê Quang Vũ", "Đà Nẵng"));
        studentList.add(new Student(2,"Bảo Trâm", "Đà Nẵng"));
        studentList.add(new Student(3,"Gấu", "Animal"));
        studentList.add(new Student(4,"Kiki", "DOGs"));
        writeToFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\practice\\readAndWrite\\students.txt", studentList);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\practice\\readAndWrite\\students2.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\practice\\readAndWrite\\students2.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

}
