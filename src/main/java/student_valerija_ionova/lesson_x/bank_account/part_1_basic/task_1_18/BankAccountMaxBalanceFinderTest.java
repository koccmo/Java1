package student_valerija_ionova.lesson_x.bank_account.part_1_basic.task_1_18;

/*Создайте класс BankAccountMaxBalanceFinderTest и протестируйте метод find().*/

class BankAccountMaxBalanceFinderTest {

    public static void main(String [] args){
        BankAccountMaxBalanceFinderTest balanceFinderTest = new BankAccountMaxBalanceFinderTest();
        balanceFinderTest.testBalanceMaxFinder();
        balanceFinderTest.testBalanceMaxFinderDepositWithdrawal();

    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testBalanceMaxFinder(){

        BankAccountMaxBalanceFinder bankAccountMaxBalanceFinder = new BankAccountMaxBalanceFinder();
        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction("Robert", 52, TransactionType.DEPOSIT);

        Transaction [] transactions =new Transaction[2];
        transactions[0] = transaction;
        transactions[1] = transaction2;
        BankAccount bankAccount = new BankAccount(transactions);
        //System.out.println(bankAccountMaxBalanceFinder.find(bankAccount));

        checkInt("testBalanceMaxFinder", bankAccountMaxBalanceFinder.find(bankAccount), 577);

    }

    public void testBalanceMaxFinderDepositWithdrawal(){

        BankAccountMaxBalanceFinder bankAccountMaxBalanceFinder = new BankAccountMaxBalanceFinder();
        Transaction transaction = new Transaction("Robert", 525, TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction("Robert", 52, TransactionType.DEPOSIT);
        Transaction transaction3 = new Transaction("Robert", 52, TransactionType.WITHDRAWAL);

        Transaction [] transactions =new Transaction[3];
        transactions[0] = transaction;
        transactions[1] = transaction2;
        transactions[2] = transaction3;
        BankAccount bankAccount = new BankAccount(transactions);
        //System.out.println(bankAccountMaxBalanceFinder.find(bankAccount));

        checkInt("testBalanceMaxFinderDepositWithdrawal", bankAccountMaxBalanceFinder.find(bankAccount), 577);

    }
}
