package student_valerija_ionova.lesson_12.level_4_junior.task_25;

/*Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!*/


import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OutOfMemoryDemo {

    public static void main (String [] args) {

        List<Long> numbers = new ArrayList<>();
        while (true) {
            numbers.add(1258L);
        }
    }
}
