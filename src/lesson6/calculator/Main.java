package lesson6.calculator;

public class Main {
    public static void main(String[] args) throws Exception {
        InputNumber input = new InputNumber();
        int firstNumber = input.inputFirst();
        int secondNumber = input.inputSecond();

        EasyCalculations calc = new EasyCalculations(firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + calc.addition(firstNumber,secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + calc.subtraction(firstNumber,secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + calc.multiplication(firstNumber,secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + calc.division(firstNumber,secondNumber));

        SqrtCalculation sqrtCalc = new SqrtCalculation(firstNumber);
        System.out.println("Корень квадратный из " + firstNumber + " числа = "+ sqrtCalc.sqrtNumber(firstNumber));
    }
}
