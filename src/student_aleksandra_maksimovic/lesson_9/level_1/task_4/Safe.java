package student_aleksandra_maksimovic.lesson_9.level_1.task_4;
/*
Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {
    public int amount;
    public String pinCode;
}
