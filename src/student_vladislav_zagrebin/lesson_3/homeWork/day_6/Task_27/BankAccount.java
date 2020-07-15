package student_vladislav_zagrebin.lesson_3.homeWork.day_6.Task_27;

public class BankAccount {

    private String ownerFirstName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwner() {
        return this.ownerFirstName;
    }

    public int getMoney() {
        return this.moneyAmount;
    }

}
