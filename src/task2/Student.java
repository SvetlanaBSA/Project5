package task2;

import java.util.Date;

public class Student {
    public static void main(String[] args) {

        String name;
        String surname;
        Date birthdayDate;


        StudentList studentList = new StudentList();
        studentList.setBirthdays();
        studentList.averageAge();


    }
}
