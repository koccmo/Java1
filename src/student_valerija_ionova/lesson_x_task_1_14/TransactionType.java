package student_valerija_ionova.lesson_x_task_1_14;

/*Создайте enum TransactionType, который будет представлять из себя
тип транзакции и будет хранить два значения:
- занесение денег на счёт (DEPOSIT);
- снятие денег со счёта (WITHDRAWAL).

public enum TransactionType {
    DEPOSIT, WITHDRAWAL
}

An enum is a special "class" that represents a group of constants
(unchangeable variables, like final variables).
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference
is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes
(but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change,
like month days, days, colors, deck of cards, etc.*/

public enum TransactionType {
    DEPOSIT, WITHDRAWAL
}
