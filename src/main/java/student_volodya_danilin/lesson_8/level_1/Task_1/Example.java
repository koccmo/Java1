package student_volodya_danilin.lesson_8.level_1.Task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Example {

    int numberFromExample;

    Example() {         //дефолтный конструктор
        numberFromExample = 55; //задаём дефолтное значение
    }
}
/*
Конструктор - это специальный метод, который вызывается
при создании нового объекта. Не всегда удобно инициализировать
все переменные класса при создании его экземпляра.
Иногда проще, чтобы какие-то значения были бы созданы по
умолчанию при создании объекта. По сути конструктор нужен
для автоматической инициализации переменных.
 */