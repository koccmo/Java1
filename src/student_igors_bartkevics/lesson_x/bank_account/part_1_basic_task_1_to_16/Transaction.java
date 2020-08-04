/*
Task_3:

Создайте класс Transaction, который будет представлять из себя
транзакцию которая совершается с банковским счётом.
У транзакции должны быть следующие свойства:
- полное имя владельца транзакции;
- сумма (можно для простоты представить в центах - тоесть целым числом);
- тип транзакции (свойство, которое будет хранить значение из enum TransactionType).

class Transaction {

    private int amount;
    private TransactionType transactionType;

    // создайте конструктор класса с двумя параметрами: аmount, transactionType.

    // создайте геттер метод для свойства amount
}

Task_4

Продолжаем создание класса Transaction, который будет представлять из себя
транзакцию которая совершается с банковским счётом.

class Transaction {

    private int amount;
    private TransactionType transactionType;

    public Transaction(int amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return this.amount;
    }

    // Маленький хак как сделать ваши доменные объекты более удобными в использовании.
    // Со стандартными методами get() и set() не всегда удобно работать.
    // Иногда мы можем добавить полезное поведение в наши доменные объекты
    // просто реализовав внутри доменных объектов простые методы.

    // создайте метод isDeposit(), данный метод должен возвращать boolean:
    // - true если транзакция является депозитом
    // - false если транзакция не является депозитом

    // создайте метод isWithdrawal(), данный метод должен возвращать boolean:
    // - true если транзакция является снятием денег со счёта
    // - false если транзакция не является снятием денег со счёта
}
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

class Transaction {

    private int amount;
    private TransactionType transactionType;

    // создайте конструктор класса с двумя параметрами: amount, transactionType.
    Transaction(int amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    // создайте геттер метод для свойства amount
    public int getAmount() {
        return amount;
    }

    public boolean isDeposit() {
        return (this.transactionType == TransactionType.DEPOSIT);
    }
    public boolean isWithdrawal() {
        return (this.transactionType == TransactionType.WITHDRAWAL);
    }


}