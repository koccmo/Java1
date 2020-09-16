package student_alexey_tretyakov.lesson_9.homework.level_1;
/*Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
        Сделайте эти свойства публично доступными.
        Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeBox {
    public String pinCode ="1234";
    public int boxMoney = 100000 ;

}
