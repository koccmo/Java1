package student_valerija_ionova.lesson_x.bank_account.part_3_4;

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {

        return ((newTransaction.isDeposit()) ||

                (newTransaction.isWithdrawal() &&
                        (currentBalanceCalculator.calculate(bankAccount) >= newTransaction.getAmount()) ) ||

                (newTransaction.isWithdrawal() && bankAccount.isCreditAccount() &&
                        ((currentBalanceCalculator.calculate(bankAccount) + bankAccount.getCreditLimit()) >=
                                newTransaction.getAmount()) ));

    }
}
