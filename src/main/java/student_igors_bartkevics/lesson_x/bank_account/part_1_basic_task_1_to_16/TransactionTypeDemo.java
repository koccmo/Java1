/*
Task_2:

Работа с enum TransactionType.

Создайте класс TransactionTypeDemo и в нём попробуйте выполнить следующие операции:

- объявление переменной типа enum:
    TransactionType deposit = TransactionType.DEPOSIT;
    TransactionType withdrawal = TransactionType.WITHDRAWAL;
    TransactionType transactionType = TransactionType.WITHDRAWAL;
- присвоение нового заначения переменной типа enum:
    TransactionType transactionType = TransactionType.WITHDRAWAL;
    transactionType = TransactionType.DEPOSIT;
- сравнение переменной типа enum:
    TransactionType transactionType = TransactionType.WITHDRAWAL;
    if (transactionType == TransactionType.WITHDRAWAL) {
        System.out.println("This transaction is withdrawal transaction!");
    }
    transactionType = TransactionType.DEPOSIT;
    if (transactionType == TransactionType.DEPOSIT) {
        System.out.println("This transaction is deposit transaction!");
    }
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

public class TransactionTypeDemo {

    public static void main(String[] args) {
        //- объявление переменной типа enum:
        TransactionType deposit = TransactionType.DEPOSIT;
        TransactionType withdrawal = TransactionType.WITHDRAWAL;
        TransactionType transactionType = TransactionType.WITHDRAWAL;
        System.out.println("deposit = " + deposit);
        System.out.println("withdrawal = " + withdrawal);
        System.out.println("transactionType = " + transactionType);

        //- присвоение нового заначения переменной типа enum:
        TransactionType transactionType2 = TransactionType.WITHDRAWAL;
        transactionType2 = TransactionType.DEPOSIT;
        System.out.println("transactionType2 = " + transactionType2);
        //- сравнение переменной типа enum:
        TransactionType transactionType3 = TransactionType.WITHDRAWAL;
        if (transactionType3 == TransactionType.WITHDRAWAL) {
            System.out.println("This transaction is withdrawal transaction!");
        }
        transactionType3 = TransactionType.DEPOSIT;
        if (transactionType3 == TransactionType.DEPOSIT) {
            System.out.println("This transaction is deposit transaction!");
        }
    }
}
