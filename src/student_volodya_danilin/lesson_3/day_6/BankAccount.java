package student_volodya_danilin.lesson_3.day_6;

public class BankAccount {

    private String ownerName;
    private int moneyAmount;

    public BankAccount(String owner, int money) {
        this.ownerName = owner;
        this.moneyAmount = money;
    }

    public String getOwner() {
        return this.ownerName;
    }

    public String getMoney() {
        return Integer.toString(this.moneyAmount);
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        String money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}


