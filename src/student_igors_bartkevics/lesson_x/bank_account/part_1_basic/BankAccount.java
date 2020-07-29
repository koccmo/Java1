/*
Task_6:

Создаём класс BankAccount.

Этот класс будет представлять банковский аккаунт и хранить все
совершённые с ним транзакции и полное имя владельца.

class BankAccount {

    private String owner;
    private Transaction[] transactions;

    // создайте конструктор класса, который принимает
    // значение свойства owner и массив транзакций
    // и сохраняет его в свойство transactions.

    // создайте get() метод для свойства owner

    // создайте get() метод для свойства transactions

}

На данный момент банковский аккаунт будет хранить только совершённые с ним транзакции
и полное имя владельца. Других свойств создавать нельзя.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class BankAccount {

    private String owner;
    private Transaction[] transactions;

    // создайте конструктор класса, который принимает
    // значение свойства owner и массив транзакций
    // и сохраняет его в свойство transactions.
    public BankAccount(String owner, Transaction[] transactions) {
        this.owner = owner;
        this.transactions = transactions;
    }

    // создайте get() метод для свойства owner
    public String getOwner() {
        return this.owner;
    }
    // создайте get() метод для свойства transactions

    public Transaction[] getTransactions() {
        return transactions;
    }
}
