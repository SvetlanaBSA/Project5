package lesson6.calculator;

public class SqrtCalculation {
    private int number;

    SqrtCalculation(int number) {
        this.number = number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    int sqrtNumber (int number) throws Exception {
        if (positiveNumber(number)) {
            this.number = (int) Math.sqrt(number);
        }
        return getNumber();
    }

    private boolean positiveNumber (int number) throws Exception {
        if (number < 0) {
            System.err.println("Ошибка. Вычисление корня из отрицательного числа");
            throw new Exception("Нельзя вычислить корень квадратный из отрицательного числа " + number);
        }
        return true;
    }
}
