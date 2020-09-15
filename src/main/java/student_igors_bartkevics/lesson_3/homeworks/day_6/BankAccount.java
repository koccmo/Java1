package student_igors_bartkevics.lesson_3.homeworks.day_6;

class BankAccount {

    private String owner;
    private int moneyAmount;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.moneyAmount;
    }

}
