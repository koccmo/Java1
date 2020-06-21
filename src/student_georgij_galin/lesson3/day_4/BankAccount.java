package student_georgij_galin.lesson3.day_4;

public class BankAccount {

    private  String ownerFirstName;
    private  String ownerLastName;
    private  int moneyAmount;

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