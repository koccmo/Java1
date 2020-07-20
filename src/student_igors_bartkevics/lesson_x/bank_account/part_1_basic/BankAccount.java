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

Task_14:

Вводим новую функциональность: кредитный лимит.

Банк, для которого вы пишите этот софт, решил предоставить
возможность своим клиентам открывать банковские аккаунты
с кредитным лимитом. Размер кредитного лимита задаётся в
момент создания банковского аккаунта и после этого не меняется.
Если у банковского аккаунта установлен размер кредитного лимита, то
клиент может уходить в минус на сумму не превышающую кредитного лимита.

Попробуйте самостоятельно реализовать это требование.

При реализации продумайте на какую уже запрограммированную вами
функциональность повлияет введение кредитного лимита. При реализации
не забудьте внести нужные изменения как в сам код так и в тесты.

 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class BankAccount {

    private String owner;
    private Transaction[] transactions;
    private int creditLimit;

    // создайте конструктор класса, который принимает
    // значение свойства owner и массив транзакций
    // и сохраняет его в свойство transactions.
    public BankAccount(String owner, Transaction[] transactions, int creditLimit) {
        this.owner = owner;
        this.transactions = transactions;
        this.creditLimit = creditLimit;
    }

    // создайте get() метод для свойства owner
    public String getOwner() {
        return this.owner;
    }
    // создайте get() метод для свойства transactions

    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
