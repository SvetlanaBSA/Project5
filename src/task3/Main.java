package task3;

public class Main {
    public static void main(String[] args) {
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        String bankName = "VTB";
        String atmProducer = "ATM Inc.";
        InfoMoney infoMoney = new InfoMoney(count100, count50, count20);
        infoMoney.reminder();
        infoMoney.reminderCount();

        AddMoney add = new AddMoney();
        add.additionMoney();
        infoMoney.reminder();
        infoMoney.reminderCount();

        SubstractMoney substract = new SubstractMoney();
        substract.substraction();
        infoMoney.reminder();
        infoMoney.reminderCount();

        InfoBank InfoBank = new InfoBank(bankName, atmProducer);
        InfoBank.bankName();
        InfoBank.bankProducer();
    }
}
