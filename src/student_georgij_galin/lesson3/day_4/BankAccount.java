package student_georgij_galin.lesson3.day_4;

public class BankAccount {

    private final String ownerFirstName;
    private final String ownerLastName;
    private final int moneyAmount;

    public BankAccount(
            String ownerFirstName,
            String ownerLastName,
            int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}