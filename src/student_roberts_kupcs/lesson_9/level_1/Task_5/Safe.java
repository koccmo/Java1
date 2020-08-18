package student_roberts_kupcs.lesson_9.level_1.Task_5;

//Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
//Начальные значения этим свойствам задавайте через публичный конструктор.
//Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
//можно было только предоставя правильный пароль.
//Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
//Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!

class Safe {
    private int password;
    private double amountOfMoney;

    public Safe(int password, double amountOfMoney) {
        this.password = password;
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void putMoney(int password, double money) {
        if (this.password == password) {
            this.amountOfMoney = this.amountOfMoney + money;
        }
    }

    public void getMoney(int password, double money) {
        if (this.password == password) {
            this.amountOfMoney = this.amountOfMoney - money;
        }
    }
}
