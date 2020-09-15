package student_vladislav_zagrebin.lesson_3.homeWork.day_4;

public class BankAccDemo {

    public static void main(String[] args) {

        BankAcc bankAcc = new BankAcc ("Viktor", "Savonin", 100000);

        String ownerFirstName = bankAcc.getOwnerFirstName();
        String ownerLastName = bankAcc.getOwnerLastName();
        int moneyAmount = bankAcc.getMoneyAmount();

        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
