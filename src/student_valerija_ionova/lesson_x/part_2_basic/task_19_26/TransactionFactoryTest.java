package student_valerija_ionova.lesson_x.part_2_basic.task_19_26;

//Для этого создайте класс TransactionFactoryTest и протестируйте методы создания транзакций.

class TransactionFactoryTest {

    public static void main(String [] args){
        TransactionFactoryTest transactionFactoryTest = new TransactionFactoryTest();
        transactionFactoryTest.testCreateDepositTransactionAmount();
        transactionFactoryTest.testCreateDepositTransactionType();
        transactionFactoryTest.testCreateWithdrawTransactionAmount();
        transactionFactoryTest.testCreateWithdrawTransactionType();
        transactionFactoryTest.testCreateWithdrawTransactionTypeWithdraw();


    }

    public void printResult(String name, boolean positiveResultOfTest){
        if (positiveResultOfTest){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkExpenseCategory(String name, ExpenseCategory methodsResult, ExpenseCategory expectedResult){
        printResult(name, methodsResult.equals(expectedResult));
    }

    public void checkDouble(String name, double methodsResult, double expectedResult){
        printResult(name, methodsResult == expectedResult);
    }


    public void testCreateDepositTransactionAmount(){
        TransactionFactory transactionFactory = new TransactionFactory();
        Transaction transaction = transactionFactory.createDepositTransaction(15);
        checkDouble("testCreateDepositTransactionAmount", transaction.getAmount(), 15);
    }

    public void testCreateDepositTransactionType(){
        TransactionFactory transactionFactory = new TransactionFactory();
        Transaction transaction = transactionFactory.createDepositTransaction(15);
        checkBoolean("testCreateDepositTransactionType", transaction.isDeposit(), true);
    }

    public void testCreateWithdrawTransactionAmount(){
        TransactionFactory transactionFactory = new TransactionFactory();
        ExpenseCategory expenseCategory = ExpenseCategory.COMMUNAL_PAYMENTS;
        Transaction transaction = transactionFactory.createWithdrawalTransaction(15, expenseCategory);
        checkDouble("testCreateWithdrawTransactionAmount", transaction.getAmount(), 15);
    }

    public void testCreateWithdrawTransactionType(){
        TransactionFactory transactionFactory = new TransactionFactory();
        ExpenseCategory expenseCategory = ExpenseCategory.COMMUNAL_PAYMENTS;
        Transaction transaction = transactionFactory.createWithdrawalTransaction(15, expenseCategory);
        checkBoolean("testCreateWithdrawTransactionType", transaction.isWithdrawal(), true);
    }


   public void testCreateWithdrawTransactionTypeWithdraw(){
        TransactionFactory transactionFactory = new TransactionFactory();
        ExpenseCategory expenseCategory = ExpenseCategory.COMMUNAL_PAYMENTS;
        Transaction transaction = transactionFactory.createWithdrawalTransaction(15, expenseCategory);
        checkBoolean("testCreateDepositTransactionTypeWithdraw", transaction.isWithdrawal(), true);
    }



}
