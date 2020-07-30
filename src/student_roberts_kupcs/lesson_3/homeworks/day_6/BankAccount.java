package student_roberts_kupcs.lesson_3.homeworks.day_6;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String ownerFirstName, int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
