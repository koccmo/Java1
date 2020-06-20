package student_georgij_galin.lesson3.day_6.task_27;

public class BankAccount {
    private final String owner;
    private final int money;

    public BankAccount(String owner, int money){
        this.owner = owner;
        this.money = money;
    }
    public String getOwner(){
        return owner;
    }
    public int getMoney(){
        return money;
    }
}