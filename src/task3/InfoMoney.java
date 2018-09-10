package task3;

public class InfoMoney extends AnyATM implements OutputReminderCount, OutputReminder {
    static int count100;
    static int count50;
    static int count20;

    public InfoMoney(int count100, int count50, int count20) {
        this.count100 = count100;
        this.count50 = count50;
        this.count20 = count20;
    }

    @Override
    public void reminder() {
        int allMoney = 100 * count100 + 50 * count50 + 20 * count20;
        System.out.println("Всего в банкомате: " + allMoney);
    }

    @Override
    public void reminderCount() {
        StringBuilder out = new StringBuilder();
        out.append("В банкомате. Купюр по 100 - ").append(count100)
                .append(". Купюр по 50 - ").append(count50)
                .append(". Купюр по 20 - ").append(count20);
        System.out.println(out);
    }
}
