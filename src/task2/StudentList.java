package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentList implements BirthdayDate, AverageAge {
    private Scanner scanner = new Scanner(System.in);

    private int count;
    private String [][] studentsArray  = new String[countStudents()][3];

    int countStudents() {
        System.out.println("Введите кол-во учеников: ");
        count = scanner.nextInt();
        return count;
    }


    @Override
    public void setBirthdays() {
        for (int i = 0; i < count ; i++) {
            System.out.println("Ученик №" + (i+1));
            System.out.print("Введите имя: ");
            studentsArray[i][0] = scanner.next();
            System.out.println("Введите фамилию: ");
            studentsArray[i][1] = scanner.next();
            System.out.println("Введите дату рождения в виде dd/mm/yyyy: ");
            studentsArray[i][2] = scanner.next();
        }
    }

    @Override
    public void averageAge() {

        long sum = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < count; i++) {
            String dateInString = studentsArray[i][2];
            try {
                long dateTimestamp = new SimpleDateFormat("dd/MM/yyyy").parse(dateInString).getTime();
                //System.out.println(dateTimestamp);
                sum = sum + dateTimestamp;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        long timestampAverage = sum / count;
        System.out.println("Средняя дата рождения студентов: " + formatter.format(timestampAverage));
    }
}
