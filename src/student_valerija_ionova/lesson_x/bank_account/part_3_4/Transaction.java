package student_valerija_ionova.lesson_x.bank_account.part_3_4;

class Transaction {

    private String fullName;
    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    Transaction (String fullName, int amount){
        this.fullName = fullName;
        this.amount = amount;
        this.transactionType = TransactionType.DEPOSIT;
        this.expenseCategory = null;
    }

    Transaction (String fullName, int amount, ExpenseCategory expenseCategory){
        this.fullName = fullName;
        this.amount = amount;
        this.transactionType = TransactionType.WITHDRAWAL;
        this.expenseCategory = expenseCategory;
    }


    int getAmount(){
        return amount;
    }

    boolean isDeposit(){
        return transactionType == TransactionType.DEPOSIT;
    }

    boolean isWithdrawal(){
        return transactionType == TransactionType.WITHDRAWAL;
    }

    ExpenseCategory getExpenseCategory(){
        return expenseCategory;
    }

}
