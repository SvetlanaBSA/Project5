package task2class;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentList students = new StudentList(2);
        students.read();
        System.out.println(Arrays.toString(students.getList()));
    }
}
