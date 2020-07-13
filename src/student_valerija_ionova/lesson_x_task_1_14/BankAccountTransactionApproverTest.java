package student_valerija_ionova.lesson_x_task_1_14;

public class BankAccountTransactionApproverTest {

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

        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        // bankCalculator.calculate(bankAccount), 577);

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        Transaction newTransaction = new Transaction("Anna", 25, TransactionType.DEPOSIT);
        checkBoolean ("testBankAccountTransactionApproverTrueDeposit", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverTrueWITHDRAW(){

        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction newTransaction = new Transaction("Robert", 55, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;

        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        // bankCalculator.calculate(bankAccount), 577);

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        //Transaction newTransaction = new Transaction("Anna", 25, TransactionType.DEPOSIT);
        checkBoolean ("testBankAccountTransactionApproverTrueWITHDRAW", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverFalseWithdraw(){

        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction newTransaction = new Transaction("Robert", 625, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;

        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverFalseWithdraw", bankAccountTransactionApprover.approve(bankAccount, newTransaction), false);
    }

    public void testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount(){

        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction newTransaction = new Transaction("Robert", 625, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;

        BankAccount bankAccount = new BankAccount(transactions);
        bankAccount.setIfCreditAccount(true);
        bankAccount.setCreditLimit(100);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverFalseWithdrawBecauseCreditAccountTooSmall(){

        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction newTransaction = new Transaction("Robert", 725, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;

        BankAccount bankAccount = new BankAccount(transactions);
        bankAccount.setIfCreditAccount(true);
        bankAccount.setCreditLimit(100);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverFalseWithdrawBecauseCreditAccountTooSmall", bankAccountTransactionApprover.approve(bankAccount, newTransaction), false);
    }

}
