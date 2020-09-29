package student_aleksandra_maksimovic.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична
 */
 class OutOfMemoryError {
    public static void main(String[] args) {
        List <Long> numbers = new ArrayList<>();
       while(true) {
           numbers.add(124L);
       }
    }
}
