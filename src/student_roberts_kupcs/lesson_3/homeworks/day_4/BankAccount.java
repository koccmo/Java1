package student_roberts_kupcs.lesson_3.homeworks.day_4;

public class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,  // ... + ","
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = 100000;         // + moneyAmount
    }

    public String getOwnerFirstName() {         // ... + ")"

        return this.ownerFirstName;             // ... + ";"
    }

    public String getOwnerLastName() {          // ... + "("

        return this.ownerLastName;             // ... + ";" + owner+Last...
    }

    public int getMoneyAmount() {               // ... void  =  ... + int ..
        return this.moneyAmount;
    }
}
