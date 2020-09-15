package student_dmitrijs_jasvins.lesson_3.day_4;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Dmitry", "Jasvin", 100);
        String firstName = bankAccount.getOwnerFirstName();
        String lastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Account name: " + firstName + " " + lastName);
        System.out.println("Amount: " + moneyAmount);
    }
}
