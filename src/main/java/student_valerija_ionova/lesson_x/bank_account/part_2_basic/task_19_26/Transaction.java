package student_valerija_ionova.lesson_x.bank_account.part_2_basic.task_19_26;

class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    public Transaction(int amount) {
        this.transactionType = TransactionType.DEPOSIT;
        this.amount = amount;
        this.expenseCategory = null;
    }

    public Transaction(int amount, ExpenseCategory expenseCategory) {
        this.transactionType = TransactionType.WITHDRAWAL;
        this.amount = amount;
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean isDeposit() {
        return TransactionType.DEPOSIT == this.transactionType;
    }

    public boolean isWithdrawal() {
        return TransactionType.WITHDRAWAL == this.transactionType;
    }

    public ExpenseCategory getExpenseCategory() {
        return this.expenseCategory;
    }

}
