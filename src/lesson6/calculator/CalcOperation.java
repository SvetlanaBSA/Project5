package lesson6.calculator;

import java.util.Scanner;

public class CalcOperation implements OperationExist {
    private static final Scanner SCANNER = new Scanner(System.in);
    String operation;

    public CalcOperation() {
    }

    public String getOperation() {
        return operation;
    }

    String inputOperation() throws Exception {
        System.out.println("Доступные операции: \"-\", \"+\", \"*\", \"/\", \"sqrt\".");
        System.out.println("Введите операцию: ");
        operation = SCANNER.next();
        if (!operationExist(operation)) {
        }
        return getOperation();
    }

    @Override
    public boolean operationExist(String operation) throws Exception{
        if (!((operation.equals("-") || operation.equals("+") || operation.equals("*") || operation.equals("/") ||
                operation.equals("sqrt")))) {
            System.err.println("Такая операция недоступна");
            System.out.println("Ошибка. Данная операция недоступна.");
            throw new Exception("Данный вид операции не поддерживается в калькуляторе.");
        }
        return true;
    }
}
