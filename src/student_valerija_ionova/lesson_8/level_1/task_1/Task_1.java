package student_valerija_ionova.lesson_8.level_1.task_1;

/*Что такое дефолтный конструктор класса?
Создайте класс и в нём объявите дефолтный конструктор.
Создайте класс Demo и продемонстрируйте вызов
дефолтного конструктора.
Дефолтный конструктор исчезает из класса, когда ты создаешь какой-то конструктор с аргументами.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_1 {

    public Task_1 (){
        System.out.println("It's default constructor!");
    }
}
