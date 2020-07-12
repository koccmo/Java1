package student_valerija_ionova.lesson_x_task_1_7;

/*Создайте класс TransactionTest и протестируйте методы isDeposit() и isWithdrawal().
Для каждого метода напишите два тест кейса, один на позитивный результат,
другой на негативный.*/

public class TransactionTest {
    public static void main(String[] args){
        TransactionTest transactionTest = new TransactionTest();
        transactionTest.testIsDepositTrue();
        transactionTest.testIsDepositFalse();
        transactionTest.testIsWithdrawalTrue();
        transactionTest.testIsWithdrawalFalse();
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testIsDepositTrue(){
        Transaction transaction = new Transaction("Bob Smith", 25, TransactionType.DEPOSIT);
        checkBoolean("testIsDepositTrue", transaction.isDeposit(), true);
    }

    public void testIsDepositFalse(){
        Transaction transaction = new Transaction("Bob Smith", 25, TransactionType.WITHDRAWAL);
        checkBoolean("testIsDepositFalse", transaction.isDeposit(), false);
    }

    public void testIsWithdrawalTrue(){
        Transaction transaction = new Transaction("Bob Smith", 25, TransactionType.WITHDRAWAL);
        checkBoolean("testIsWithdrawTrue", transaction.isWithdrawal(), true);
    }

    public void testIsWithdrawalFalse(){
        Transaction transaction = new Transaction("Bob Smith", 25, TransactionType.DEPOSIT);
        checkBoolean("testIsWithdrawFalse", transaction.isWithdrawal(), false);
    }


}
