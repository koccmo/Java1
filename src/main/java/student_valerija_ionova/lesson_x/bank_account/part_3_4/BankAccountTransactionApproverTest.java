package student_valerija_ionova.lesson_x.bank_account.part_3_4;

class BankAccountTransactionApproverTest {

    public static void main(String[] args){
        BankAccountTransactionApproverTest bankAccountTransactionApproverTest = new BankAccountTransactionApproverTest();

        bankAccountTransactionApproverTest.testBankAccountTransactionApproverTrueBecauseDeposit();
        bankAccountTransactionApproverTest.testBankAccountTransactionApproverTrueWITHDRAW();
        bankAccountTransactionApproverTest.testBankAccountTransactionApproverFalseWithdraw();
        bankAccountTransactionApproverTest.testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount();
        bankAccountTransactionApproverTest.testBankAccountTransactionApproverFalseWithdrawBecauseCreditAccountTooSmall();
    }

    public void checkBoolean (String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testBankAccountTransactionApproverTrueBecauseDeposit(){

        Transaction transaction = new Transaction("Robert", 525);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        Transaction newTransaction = new Transaction("Anna", 25);
        checkBoolean ("testBankAccountTransactionApproverTrueDeposit", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverTrueWITHDRAW(){

        Transaction transaction = new Transaction("Robert", 525);
        Transaction newTransaction = new Transaction("Robert", 55, ExpenseCategory.FOOD);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);

        checkBoolean ("testBankAccountTransactionApproverTrueWITHDRAW", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverFalseWithdraw(){

        Transaction transaction = new Transaction("Robert", 525);
        Transaction newTransaction = new Transaction("Robert", 625, ExpenseCategory.ENTERTAINMENT);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverFalseWithdraw", bankAccountTransactionApprover.approve(bankAccount, newTransaction), false);
    }

    public void testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount(){

        Transaction transaction = new Transaction("Robert", 525);
        Transaction newTransaction = new Transaction("Robert", 625, ExpenseCategory.FOOD);

        BankAccount bankAccount = new BankAccount("Robert", 100, transaction);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverFalseWithdrawBecauseCreditAccountTooSmall(){

        Transaction transaction = new Transaction("Robert", 525);
        Transaction newTransaction = new Transaction("Robert", 725, ExpenseCategory.COMMUNAL_PAYMENTS);

        BankAccount bankAccount = new BankAccount("Robert", 100,transaction);

        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverFalseWithdrawBecauseCreditAccountTooSmall", bankAccountTransactionApprover.approve(bankAccount, newTransaction), false);
    }

}
