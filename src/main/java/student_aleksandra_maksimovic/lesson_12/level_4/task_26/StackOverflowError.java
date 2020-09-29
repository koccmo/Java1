package student_aleksandra_maksimovic.lesson_12.level_4.task_26;
/*
Напишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!
 */
class  StackOverflowError {

    public static void recursiveCall() {
        recursiveCall();
    }

    public static void main(String[] args)
    {
        recursiveCall();
    }
}