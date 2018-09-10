package lesson6.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputNumber implements IsInputNumber{
    private static final Scanner SCANNER = new Scanner(System.in);

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

    @Override
    public int inputNumber(){
        int number;
        try {
            number = SCANNER.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Ошибка. Несоответствие типа вводимого значения. Введите целые числа.");
            throw new InputMismatchException("Несоответствие вводимого типа. Должны быть целые числа.");
        }
        return number;
    }
}
