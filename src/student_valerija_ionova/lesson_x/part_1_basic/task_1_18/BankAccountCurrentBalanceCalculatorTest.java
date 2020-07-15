package student_valerija_ionova.lesson_x.part_1_basic.task_1_18;

public class BankAccountCurrentBalanceCalculatorTest {
    public static void main (String[] args){
        BankAccountCurrentBalanceCalculatorTest bankAccountCurrentBalanceCalculatorTest = new BankAccountCurrentBalanceCalculatorTest();

        bankAccountCurrentBalanceCalculatorTest.testDepositTransactionOneTransaction();
        bankAccountCurrentBalanceCalculatorTest.testDepositTransactionTwoTransactions();

        bankAccountCurrentBalanceCalculatorTest.testDepositAndWithdrawalTransactions();
        bankAccountCurrentBalanceCalculatorTest.testWithdrawalTransactionOneTransaction();

    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testDepositTransactionOneTransaction(){
        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction [] transactions =new Transaction[1];
        transactions[0]=transaction;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        checkInt("testDepositTransactionOneTransaction", bankCalculator.calculate(bankAccount), 525);

    }

    public void testDepositTransactionTwoTransactions(){
        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction("Robert", 52, TransactionType.DEPOSIT);

        Transaction [] transactions =new Transaction[2];
        transactions[0] = transaction;
        transactions[1] = transaction2;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        checkInt("testDepositTransactionTwoTransactions", bankCalculator.calculate(bankAccount), 577);

    }

    public void testDepositAndWithdrawalTransactions(){
        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction("Robert", 25, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[2];
        transactions[0] = transaction;
        transactions[1] = transaction2;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        checkInt("testDepositAndWithdrawalTransactions", bankCalculator.calculate(bankAccount), 500);

    }

    public void testWithdrawalTransactionOneTransaction(){
        Transaction transaction = new Transaction("Robert", 525, TransactionType.WITHDRAWAL);
        Transaction [] transactions =new Transaction[1];
        transactions[0]=transaction;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        checkInt("testWithdrawalTransactionOneTransaction", bankCalculator.calculate(bankAccount), -525);
    }

    public void testWithdrawalTransactionCredit(){
        Transaction transaction = new Transaction("Robert", 525, TransactionType.WITHDRAWAL);
        Transaction [] transactions =new Transaction[1];
        transactions[0]=transaction;
        BankAccount bankAccount = new BankAccount(transactions);
        BankAccountCurrentBalanceCalculator bankCalculator = new BankAccountCurrentBalanceCalculator();

        checkInt("testWithdrawalTransactionOneTransaction", bankCalculator.calculate(bankAccount), -525);
    }
}
