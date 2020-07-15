/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.

Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
*/
package student_igors_bartkevics.lesson_5.homework.level_x.super_task_1;

public class Task_29 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.printEvenNumbersToConsole(array);
    }
}
