package student_valerija_ionova.lesson_x.part_1_basic.task_1_18;

class BankAccountMinBalanceFinderTest {

    public static void main(String [] args){
        BankAccountMinBalanceFinderTest bankAccountMinBalanceFinderTest = new BankAccountMinBalanceFinderTest();
        bankAccountMinBalanceFinderTest.testMinBalanceFinder();
        bankAccountMinBalanceFinderTest.testMinBalanceFinderWithdrawOperations();
    }

    public void testMinBalanceFinder(){

        BankAccountMinBalanceFinder bankAccountMinBalanceFinder = new BankAccountMinBalanceFinder();
        Transaction [] transactions = new Transaction[4];
        transactions[0] = new Transaction("Ed", 25, TransactionType.DEPOSIT);
        transactions[1] = new Transaction("Ed", 25, TransactionType.DEPOSIT);
        transactions[2] = new Transaction("Ed", 25, TransactionType.DEPOSIT);
        transactions[3] = new Transaction("Ed", 25, TransactionType.DEPOSIT);

        BankAccount bankAccount = new BankAccount(transactions);
        //System.out.println(bankAccountMinBalanceFinder.find(bankAccount));
        if (bankAccountMinBalanceFinder.find(bankAccount) == 25){
            System.out.println("testMinBalanceFinder OK");
        }else{
            System.out.println("testMinBalanceFinder FAIL");
        }
    }

    public void testMinBalanceFinderWithdrawOperations(){

        BankAccountMinBalanceFinder bankAccountMinBalanceFinder = new BankAccountMinBalanceFinder();
        Transaction [] transactions = new Transaction[4];
        transactions[0] = new Transaction("Ed", 25, TransactionType.DEPOSIT);
        transactions[1] = new Transaction("Ed", 20, TransactionType.WITHDRAWAL);
        transactions[2] = new Transaction("Ed", 55, TransactionType.WITHDRAWAL);
        transactions[3] = new Transaction("Ed", 25, TransactionType.DEPOSIT);

        BankAccount bankAccount = new BankAccount(transactions);
        //System.out.println(bankAccountMinBalanceFinder.find(bankAccount));
        if (bankAccountMinBalanceFinder.find(bankAccount) == -50){
            System.out.println("testMinBalanceFinderWithdrawOperations OK");
        }else{
            System.out.println("testMinBalanceFinderWithdrawOperations FAIL");
        }
    }
}
