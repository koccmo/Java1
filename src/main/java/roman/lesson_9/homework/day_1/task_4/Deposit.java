package roman.lesson_9.homework.day_1.task_4;

public class Deposit {

    public String pinCode;
    public int amount;

    Deposit (String pinCode, int amount) {
        this.pinCode = pinCode;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "pinCode='" + pinCode + '\'' +
                ", amount=" + amount +
                '}';
    }
}
