package student_valerija_ionova.lesson_x_task_1_7;

/*Решаем задачу: можно ли разрешить выполнить новую транзакцию?

Вам поручили реализовать алгоритм, который будет принимать решение
можно ли одобрить новую транзакцию или нет. На данный момент правила
просты - транзакцию можно одобрить только если на балансе у пользователя
есть достаточно средств. В минус уходить нельзя :).

Для выполнения этого расчёта создайте новый классе BankAccountTransactionApprover.

class BankAccountTransactionApprover {

    // для подтверждения или отклонения новой транзакции вам потребуется
    // узнать текущий баланс банковского аккаунта, алгоритм расчёта
    // текущего баланса реализован в классе BankAccountCurrentBalanceCalculator,
    // что бы не копировать этот алгоритм в класс BankAccountTransactionApprover
    // воспользуемся алгоритмом из класса BankAccountCurrentBalanceCalculator
    // для этого создаём следующее свойство
    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    // создайте конструктор класса у которого будет один параметр BankAccountCurrentBalanceCalculator
    // сохраните полученную ссылку в свойство currentBalanceCalculator созданное ранее

}*/

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    // реализуйте метод подтверждения банковской транзакции
    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        BankAccountCurrentBalanceCalculator calc = new BankAccountCurrentBalanceCalculator();
        if ((newTransaction.isDeposit()) || ((bankAccount.getIfCreditAccount()) && (newTransaction.getAmount() <= (calc.calculate(bankAccount) + bankAccount.getCreditLimit())))){
            return true;
        }else{
            if (newTransaction.getAmount() <= calc.calculate(bankAccount)){
                return true;
            }else{
                return false;
            }
        }
        // если транзакция это депозит то её всегда разрешаем - пополнить банковский аккаунт можно всегда
        // если транзакция это снятие денег со счето то:
        // return true - если у пользователя достаточно денег на балансе
        // return false - если у пользователя не достаточно денег на балансе
        // для получения текущего баланса воспользуйтесь свойством currentBalanceCalculator
        // значение которого вы получает через конструктор
    }

}
