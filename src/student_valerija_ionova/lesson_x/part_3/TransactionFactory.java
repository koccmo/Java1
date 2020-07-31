package student_valerija_ionova.lesson_x.part_3;

public class TransactionFactory {

        public static Transaction createDepositTransaction(String name, int amount) {
            return new Transaction(name, amount);
            // создайте в классе Transaction соответствующий конструктор в котором
            // свойство transactionType устанавливается в значение TransactionType.DEPOSIT,
            // а свойство expenseCategory в значение null
        }

        public static Transaction createWithdrawalTransaction(String name, int amount, ExpenseCategory expenseCategory) {
            return new Transaction(name, amount, expenseCategory);
            // создайте в классе Transaction соответствующий конструктор в котором
            // свойство transactionType устанавливается в значение TransactionType.WITHDRAWAL,
            // а свойство expenseCategory принимает значение полученное в параметре метода
        }

}
