package lesson6.calculator;

public class Main {
    public static void main(String[] args) throws Exception {
        InputNumber input = new InputNumber();
        int firstNumber = input.inputFirst();

        CalcOperation operation = new CalcOperation();
        String calcOperation;
        calcOperation = operation.inputOperation();

        if (calcOperation.equals("+") || calcOperation.equals("-") || calcOperation.equals("*") || calcOperation.equals("/")) {
            int secondNumber = input.inputSecond();
            EasyCalculations easyCalculations = new EasyCalculations(firstNumber, secondNumber);
            if (calcOperation.equals("+")) {
                System.out.println(firstNumber + " + " + secondNumber + " = " + easyCalculations.addition(firstNumber, secondNumber));
            } else if (calcOperation.equals("-")) {
                System.out.println(firstNumber + " - " + secondNumber + " = " + easyCalculations.subtraction(firstNumber, secondNumber));
            } else if (calcOperation.equals("*")) {
                System.out.println(firstNumber + " * " + secondNumber + " = " + easyCalculations.multiplication(firstNumber, secondNumber));
            } else if (calcOperation.equals("/")) {
                System.out.println(firstNumber + " / " + secondNumber + " = " + easyCalculations.division(firstNumber, secondNumber));
            }
        } else if (calcOperation.equals("sqrt")) {
            SqrtCalculation sqrtCalc = new SqrtCalculation(firstNumber);
            System.out.println("Корень квадратный из числа " + firstNumber + " = " + sqrtCalc.sqrtNumber(firstNumber));
        }
    }
}
