package student_anvars_intezars.home_tasks.lesson_3.day6;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + bankAccount.getOwner());
        System.out.println("Money = " + bankAccount.getMoney());
    }
}
