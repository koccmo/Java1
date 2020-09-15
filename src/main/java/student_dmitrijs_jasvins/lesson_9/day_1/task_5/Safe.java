package student_dmitrijs_jasvins.lesson_9.day_1.task_5;

/*
Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {
    private String pinCode;
    private int balance;

    public Safe(String pinCode, int balance) {
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public void putMoney(String pinCode, int money) {
        if (this.pinCode.equals(pinCode)) {
            this.balance += money;
        }
    }

    public void getMoney(String pinCode, int money) {
        if (this.pinCode.equals(pinCode)) {
            this.balance -= money;
        }
    }

    public int getBalance() {
        return balance;
    }
}