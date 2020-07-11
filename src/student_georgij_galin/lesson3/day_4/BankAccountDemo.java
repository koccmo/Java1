package student_georgij_galin.lesson3.day_4;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Georgij", "Galin", 500);
        String firstName = bankAccount.getOwnerFirstName();
        String lastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Account name: " + firstName + " " + lastName);
        System.out.println("Amount: " + moneyAmount);
    }
}