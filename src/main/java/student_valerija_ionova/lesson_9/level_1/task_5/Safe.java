package student_valerija_ionova.lesson_9.level_1.task_5;

/*Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe {

    private int pinCode;
    private int moneyAmount;

    public Safe (int pinCode, int moneyAmount){
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public void getMoney (int pinCode, int amount){
        if (this.pinCode == pinCode){
            this.moneyAmount -= amount;
        }
    }

    public void putMoney (int pinCode, int amount){
        if (this.pinCode == pinCode){
            moneyAmount += amount;
        }
    }

    public int getMoneyAmount(){
        return moneyAmount;
    }

}
