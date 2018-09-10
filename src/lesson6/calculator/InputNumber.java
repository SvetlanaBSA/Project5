package lesson6.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputNumber {
    private static final Scanner scan = new Scanner(System.in);

    int inputFirst() {
        System.out.println("Введите первое число: ");
        int firstNumber = inputNumber();
        return firstNumber;
    }

    int inputSecond() {
        System.out.println("Введите второе чисто: ");
        int secondNumber = inputNumber();
        return secondNumber;
    }

    private int inputNumber(){
        int number;
        try {
            number = scan.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Ошибка. Несоответствие типа вводимого значения. Введите целые числа.");
            throw new InputMismatchException("Несоответствие вводимого типа. Должны быть целые числа.");
        }
        return number;
    }
}
