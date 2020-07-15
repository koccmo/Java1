package student_valerija_ionova.lesson_x.part_2_basic.task_19_26;

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

        TransactionFactory transactionFactory = new TransactionFactory();

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transactionFactory.createDepositTransaction(525);
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        Transaction newTransaction = transactionFactory.createDepositTransaction(25);
        checkBoolean ("testBankAccountTransactionApproverTrueDeposit", bankAccountTransactionApprover.approve(bankAccount, newTransaction), true);
    }

    public void testBankAccountTransactionApproverTrueWITHDRAW(){

        TransactionFactory transactionFactory = new TransactionFactory();

        Transaction transaction = transactionFactory.createDepositTransaction(525);
        Transaction newTransaction = transactionFactory.createWithdrawalTransaction(525, ExpenseCategory.FOOD);

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

        TransactionFactory transactionFactory = new TransactionFactory();

        Transaction transaction = transactionFactory.createDepositTransaction(525);
        Transaction newTransaction = transactionFactory.createWithdrawalTransaction(625, ExpenseCategory.FOOD);

        Transaction [] transactions =new Transaction[1];
        transactions[0] = transaction;

        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(bankCalculator);
        checkBoolean ("testBankAccountTransactionApproverFalseWithdraw", bankAccountTransactionApprover.approve(bankAccount, newTransaction), false);
    }

    public void testBankAccountTransactionApproverTrueWithdrawBecauseCreditAccount(){

        TransactionFactory transactionFactory = new TransactionFactory();

        Transaction transaction = transactionFactory.createDepositTransaction(525);
        Transaction newTransaction = transactionFactory.createWithdrawalTransaction(625, ExpenseCategory.FOOD);


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

        TransactionFactory transactionFactory = new TransactionFactory();

        Transaction transaction = transactionFactory.createDepositTransaction(525);
        Transaction newTransaction = transactionFactory.createWithdrawalTransaction(725, ExpenseCategory.FOOD);

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
