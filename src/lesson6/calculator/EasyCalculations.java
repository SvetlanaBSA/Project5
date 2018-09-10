package lesson6.calculator;

class EasyCalculations extends EasyCalculator {
    private int firstName;
    private int secondName;

    EasyCalculations(int firstName, int secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    long multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    int division(int firstNumber, int secondNumber) {
        int result;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено.");
            System.err.println("Деление на 0 запрещено.");
            throw new ArithmeticException("Попытка деления на 0: firstNumber = " + firstNumber + "; secondNumber = " + secondNumber);
        }
        return result;
    }
}
