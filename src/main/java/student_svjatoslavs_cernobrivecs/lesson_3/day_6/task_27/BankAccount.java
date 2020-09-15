package student_svjatoslavs_cernobrivecs.lesson_3.day_6.task_27;

public class BankAccount {

    private String ownerFirstName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, int moneyAmount){
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }
    public String getOwner(){
        return this.ownerFirstName;
    }
    public int getMoney(){
        return this.moneyAmount;
    }
}
