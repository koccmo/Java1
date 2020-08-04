package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

class BankAccountCurrentBalanceCalculatorTest {

    public static void main(String[] args) {
        BankAccountCurrentBalanceCalculatorTest test = new BankAccountCurrentBalanceCalculatorTest();
        test.currentAmountCalculation();
    }

    public void currentAmountCalculation() {
        Transaction[] transactions = new Transaction[3];
        transactions[0] = (new Transaction(3000, TransactionType.DEPOSIT));
        transactions[1] = (new Transaction(2500, TransactionType.DEPOSIT));
        transactions[2] = (new Transaction(3500, TransactionType.WITHDRAWAL));
        BankAccountCurrentBalanceCalculator calculator = new BankAccountCurrentBalanceCalculator();
        BankAccount bankAccount = new BankAccount("Name Surname", transactions, 0);
        checkResult(calculator.calculate(bankAccount) == 2000, "Current amount calculation");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
