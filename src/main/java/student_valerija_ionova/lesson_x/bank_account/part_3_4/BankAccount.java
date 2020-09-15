package student_valerija_ionova.lesson_x.bank_account.part_3_4;

import java.util.ArrayList;
import java.util.Arrays;

class BankAccount {

    private String owner;
    private ArrayList <Transaction> transactions;
    private int creditLimit;
    private boolean isCreditAccount = false;

    BankAccount (String owner, int creditLimit, Transaction ... transactions){
        this.owner = owner;
        this.transactions = new ArrayList <>(Arrays.asList(transactions));
        this.creditLimit = creditLimit;
        if (creditLimit > 0){
            this.isCreditAccount = true;
        }
    }

    String getOwner(){
        return owner;
    }

    int getCreditLimit(){
        return creditLimit;
    }

    boolean isCreditAccount(){
        return isCreditAccount;
    }

    ArrayList <Transaction> getTransactions(){
        return  transactions;
    }

    void addTransaction (Transaction transaction){
        transactions.add(transaction);
    }
}
