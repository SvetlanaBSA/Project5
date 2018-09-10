package task3;

import java.util.Scanner;

public class AddMoney {
    static final Scanner scan = new Scanner(System.in);
    //int count100;
    //int count50;
    //int count20;

    public AddMoney() {
        //this.count100 = count100;
        //this.count50 = count50;
        //this.count20 = count20;
    }

    public void additionMoney () {
        System.out.println("Сколько купюр по 100 было добавлено?");
        int count = scan.nextInt();
        InfoMoney.count100 += count;
        System.out.println("Сколько купюр по 50 было добавлено?");
        count = scan.nextInt();
        InfoMoney.count50 += count;
        System.out.println("Сколько купюр по 20 было добавлено?");
        count = scan.nextInt();
        InfoMoney.count20 += count;
    }
/*
    @Override
    public void reminder() {
        int allMoney = 100 * InfoMoney.count100 + 50 * InfoMoney.count50 + 20 * count20;
        System.out.println("Всего в банкомате: " + allMoney);
    }

    @Override
    public void reminderCount() {
        StringBuilder out = new StringBuilder();
        out.append("В банкомате. Купюр по 100 - ").append(count100)
                .append(". Купюр по 50 - ").append(count50)
                .append(". Купюр по 20 - ").append(count20);
        System.out.println(out);
    }
    */
}
