package student_anvars_intezars.home_tasks.lesson_3.day6.task27;

public class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner,int money) {
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
