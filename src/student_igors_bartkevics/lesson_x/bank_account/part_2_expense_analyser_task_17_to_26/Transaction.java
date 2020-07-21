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

Task_18:

Вводим новую функциональность: анализ расходов.

Для проведения анализа расходов необходимо, что бы у каждой
транзакции было указано к какой категории расходов она относится.

Банк провёл огромную работу и готов предоставить информацию к какой
категории расходов относится каждая транзакция.

Решаем задачу в лоб. Добавьте новое свойство expenseCategory к классу Transaction.

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

    public boolean isDeposit() {
        return TransactionType.DEPOSIT == this.transactionType;
    }

    public boolean isWithdrawal() {
        return TransactionType.WITHDRAWAL == this.transactionType;
    }
}

Task_21:
Вводим новую функциональность: анализ расходов.

Как разрешить создавать WITHDRAWAL транзакции
с указанием обязательного свойства expenseCategory, а для DEPOSIT транзакций
при создании не указывать значение свойства expenseCategory.

Есть несколько способов решения этой задачи.

Давайте рассмотрим способ с применением дизайн паттерна фактори метод (FactoryMethod).

Создайте класс TransactionFactory:

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
        // создайте в классе Transaction соответствующий конструктор в котором
        // свойство transactionType устанавливается в значение TransactionType.DEPOSIT,
        // а свойство expenseCategory в значение null
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, expenseCategory);
        // создайте в классе Transaction соответствующий конструктор в котором
        // свойство transactionType устанавливается в значение TransactionType.WITHDRAWAL,
        // а свойство expenseCategory принимает значение полученное в параметре метода
    }

}

Класс TransactionFactory будет отвечать за создание объектов Transaction.
Это единственная его ответственность. Дизайн паттерн фактору метод - это метод
единственное предназначение которого энкапсулировать в себе алгоритм создания
сложных объектов (объектов с не тривиальной логикой создания, таких как класс Transaction).

Удалите из класса Transaction конструктор со всеми параметрами, который
был создан нами ранее. В классе Transaction должно остаться только два
конструктора, которые были созданы в рамках этого задания. Исправьте код
в тех местах приложения, которые использовали удалённый конструктор.

Новые объекты класса Transaction можно создавать следующим образом:

Transaction deposit = TransactionFactory.createDepositTransaction(10);
Transaction withdrawal = TransactionFactory.createDepositTransaction(10, ExpenseCategory.FOOD);

 */
package student_igors_bartkevics.lesson_x.bank_account.part_2_expense_analyser_task_17_to_26;



class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    // создайте в классе Transaction соответствующий конструктор в котором
    // свойство transactionType устанавливается в значение TransactionType.DEPOSIT,
    // а свойство expenseCategory в значение null

    Transaction(int amount) {
        this.amount = amount;
        this.transactionType = TransactionType.DEPOSIT;
        this.expenseCategory = null;
    }

    // создайте в классе Transaction соответствующий конструктор в котором
    // свойство transactionType устанавливается в значение TransactionType.WITHDRAWAL,
    // а свойство expenseCategory принимает значение полученное в параметре метода

    Transaction(int amount, ExpenseCategory expenseCategory) {
        this.amount = amount;
        this.transactionType = TransactionType.WITHDRAWAL;
        this.expenseCategory = expenseCategory;
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

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}