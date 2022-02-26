package roman.lesson_9.homework.day_1.task_4;

public class DepositDemo {

    public static void main(String[] args) {
        Deposit deposit = new Deposit("pass", 100);
        deposit.pinCode = "123";
        deposit.amount = 0;
        System.out.println(deposit);
    }
}
