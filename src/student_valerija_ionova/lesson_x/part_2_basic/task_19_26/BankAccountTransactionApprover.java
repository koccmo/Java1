package student_valerija_ionova.lesson_x.part_2_basic.task_19_26;

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        BankAccountCurrentBalanceCalculator calc = new BankAccountCurrentBalanceCalculator();
        if ((newTransaction.isDeposit()) || ((bankAccount.getIfCreditAccount()) && (newTransaction.getAmount() <= (calc.calculate(bankAccount) + bankAccount.getCreditLimit())))){
            return true;
        }else{
            if (newTransaction.getAmount() <= calc.calculate(bankAccount)){
                return true;
            }else{
                return false;
            }
        }
    }

}
