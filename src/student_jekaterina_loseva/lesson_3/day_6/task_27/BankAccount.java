package student_jekaterina_loseva.lesson_3.day_6.task_27;

public class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}
