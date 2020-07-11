package student_dmitrijs_jasvins.lesson_3.day_6.task_27;

public class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
