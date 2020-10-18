package student_alexey_tretyakov.lesson_9.homework.level_1.task_5;
/*Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
        Сделайте эти свойства публично доступными.
        Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.*/

class SafeBox {
    private String pinCode ="1234";
    private int boxMoney = 100000 ;

    protected String  getPinCode(){
        return this.pinCode;
    }
    protected Integer getBoxMoney(String pinCode) {
        if (pinCode.equals(this.pinCode)) {
            return this.boxMoney;
        } else {
            System.out.println("Pin code error");
            return null;
        }
    }

}
