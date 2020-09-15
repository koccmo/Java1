package student_jaroslav_brutan.lesson_3.day_6.task_27;

public class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner,int money) {
        this.money = money;
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
