package task2class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentList implements Input, AverageAge {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Dateable[] list;

    public StudentList(int size) {
        list = new Student[size];
    }

    public Dateable[] getList() {
        return list;
    }

    @Override
    public TimePeriod calculate() {
        return null;
    }

    @Override
    public void read() {
        for (int i = 0; i < list.length; i++) {
            System.out.print("Введите имя студента: ");
            String name = SCANNER.next();
            System.out.println("Введите фамилию студента: ");
            String surname = SCANNER.next();
            System.out.println("Введите дату рождения (dd-MM-yyyy): ");
            Date date = parse(SCANNER.next());
            list[i] = new Student(date, name, surname);
        }
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
