package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentList implements BirthdayDate, AverageAge {
    private Scanner scanner = new Scanner(System.in);

    private int count = countStudents();
    private String[] studentsNames = new String[count];
    private String[] studentsSurnames = new String[count];
    private Date[] studentsBirthdays = new Date[count];
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// HH:mm:ss

    private int countStudents() {
        System.out.println("Введите кол-во учеников: ");
        count = scanner.nextInt();
        return count;
    }

    @Override
    public void setBirthdays() throws ParseException {
        String date;
        for (int i = 0; i < count; i++) {
            System.out.println("Ученик №" + (i + 1));
            System.out.print("Введите имя: ");
            studentsNames[i] = scanner.next();
            System.out.println("Введите фамилию: ");
            studentsSurnames[i] = scanner.next();
            System.out.println("Введите дату рождения в виде dd/MM/yyyy");
            date = scanner.next();
            studentsBirthdays[i] = sdf.parse(date);
        }
    }

    @Override
    public void averageAge(){
        long diff = averageBirthdayDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy 'лет' MM 'месяца' dd 'дней' HH 'часов' mm 'минут'"); //-1970 01 01
        System.out.println("Средний возраст студентов: " + formatter.format(diff));
    }

    private long averageBirthdayDate(){
        long sum = 0;
        Date date = new Date();
        long diff;
        for (int i = 0; i < count; i++) {
            diff = Math.abs(date.getTime() - studentsBirthdays[i].getTime());
            sum += diff;
        }
        long timestampAverage = sum / count;
        System.out.println("Средняя дата рождения студентов: " + sdf.format(timestampAverage));
        System.out.println("timestampAverage = " + timestampAverage);
        return timestampAverage;
    }
}
