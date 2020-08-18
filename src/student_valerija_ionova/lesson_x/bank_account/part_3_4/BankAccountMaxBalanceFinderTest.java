package student_valerija_ionova.lesson_x.bank_account.part_3_4;

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
        Transaction transaction = new Transaction("Robert", 525);
        Transaction transaction2 = new Transaction("Robert", 52);
        BankAccount bankAccount = new BankAccount("Robert", 0, transaction, transaction2);

        checkInt("testBalanceMaxFinder", bankAccountMaxBalanceFinder.find(bankAccount), 577);

    }

    public void testBalanceMaxFinderDepositWithdrawal(){

        BankAccountMaxBalanceFinder bankAccountMaxBalanceFinder = new BankAccountMaxBalanceFinder();
        Transaction transaction = new Transaction("Robert", 525);
        Transaction transaction2 = new Transaction("Robert", 52);
        Transaction transaction3 = new Transaction("Robert", 52, ExpenseCategory.COMMUNAL_PAYMENTS);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction, transaction2, transaction3);

        checkInt("testBalanceMaxFinderDepositWithdrawal", bankAccountMaxBalanceFinder.find(bankAccount), 577);

    }
}
