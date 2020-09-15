package student_vladislav_zagrebin.lesson_3.homeWork.day_4;

public class BankAcc {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAcc (String ownerFirstName, String ownerLastName, int moneyAmount) {

        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }
        public String getOwnerFirstName() { return this.ownerFirstName; }
        public String getOwnerLastName() { return  this.ownerLastName; }
        public int getMoneyAmount() { return this.moneyAmount; }
}
