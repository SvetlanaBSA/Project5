package task2;

import java.text.ParseException;
import java.util.Date;

public class Student {
    public static void main(String[] args) throws ParseException {

        String name;
        String surname;
        Date birthdayDate;

        StudentList studentList = new StudentList();
        studentList.setBirthdays();
        studentList.averageAge();
    }
}
