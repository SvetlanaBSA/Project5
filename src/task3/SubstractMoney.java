package task3;

import java.util.Scanner;

public class SubstractMoney {
    static final Scanner scan = new Scanner(System.in);

    public SubstractMoney() {
    }

    void substraction() {
        System.out.println("Введите сумму, которую хотите снять: ");
        int sum = scan.nextInt();
        int subCount100 = sum / 100;
        int subCount50 = (sum - subCount100 * 100) / 50;
        int subCount20 = (sum - subCount100 * 100 - subCount50 * 50) / 20;
        InfoMoney.count100 -= subCount100;
        InfoMoney.count50 -= subCount50;
        InfoMoney.count20 -= subCount20;
    }
}
