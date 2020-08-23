package student_valerija_ionova.lesson_x.bank_account.part_2_basic.task_19_26;

//Transaction deposit = TransactionFactory.createDepositTransaction(10);
//Transaction withdrawal = TransactionFactory.createDepositTransaction(10, ExpenseCategory.FOOD);

class TransactionFactory {

   public static Transaction createDepositTransaction(int amount) {
            return new Transaction(amount);
        }

        public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
            return new Transaction(amount, expenseCategory);
        }
}
