package task3;

public class InfoBank implements AboutATM {
    String bankName;
    String atmProducer;

    public InfoBank(String bankName, String atmProducer) {
        this.bankName = bankName;
        this.atmProducer = atmProducer;
    }

    @Override
    public void bankName() {
        System.out.println("Bank Name: " + bankName);
    }

    @Override
    public void bankProducer() {
        System.out.println("ATM Producer: " + atmProducer);
    }
}
