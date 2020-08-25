package student_volodya_danilin.lesson_9.level_1.Task_5;

public class Demo {

    public static void main(String[] Args) {

        System.out.println("Creating new safe object...");
        BankSafe bank = new BankSafe(4444);
        bank.showBalance(4444);

        System.out.println("Putting 1000 into safe...");
        bank.putMoney(4444, 1000);
        bank.showBalance(4444);

        System.out.println("Withdrawing 1300 from safe...");
        bank.getMoney(4444, 1300);
        bank.showBalance(4444);

        System.out.println("Trying to withdraw with incorrect pin code...");
        bank.getMoney(5555, 100);
        bank.showBalance(4444);

        System.out.println("Trying to deposit with incorrect pin code...");
        bank.putMoney(5555, 200);
        bank.showBalance(4444);
    }
}
