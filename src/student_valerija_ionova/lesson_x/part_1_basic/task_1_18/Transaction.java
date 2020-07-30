package student_valerija_ionova.lesson_x.part_1_basic.task_1_18;

/*Task 3
Создайте класс Transaction, который будет представлять из себя
транзакцию которая совершается с банковским счётом.
У транзакции должны быть следующие свойства:
- полное имя владельца транзакции;
- сумма (можно для простоты представить в центах - тоесть целым числом);
- тип транзакции (свойство, которое будет хранить значение из enum TransactionType).

class Transaction {

    private String owner;
    private int amount;
    private TransactionType transactionType;

    // создайте конструктор класса с тремя параметрами: owner, moneyAmount, transactionType.

    // создайте геттер метод для свойства owner

    // создайте геттер метод для свойства amount

}

Task 4

// создайте метод isDeposit(), данный метод должен возвращать boolean:
    // - true если транзакция является депозитом
    // - false если транзакция не является депозитом

    // создайте метод isWithdrawal(), данный метод должен возвращать boolean:
    // - true если транзакция является снятием денег со счёта
    // - false если транзакция не является снятием денег со счёта*/

class Transaction {

    private String owner;
    private int amount;
    private TransactionType transactionType;
    //private ExpenseCategory expenseCategory;

    public Transaction (String owner, int amount, TransactionType transaction
                        //,ExpenseCategory expenseCategory
    ){
        this.owner = owner;
        this.amount = amount;
        this.transactionType = transaction;
        //this.expenseCategory = expenseCategory;
    }

    public String getOwner(){
        return owner;
    }

    public int getAmount(){
        return amount;
    }

    public boolean isDeposit(){
        if (transactionType == TransactionType.DEPOSIT){
            return true;
        }else{
            return false;
        }
    }

    public boolean isWithdrawal(){
        if (transactionType == TransactionType.WITHDRAWAL){
            return true;
        }else return false;
    }

    /*public ExpenseCategory getExpenseCategory(){
        return expenseCategory;
    }*/

}
