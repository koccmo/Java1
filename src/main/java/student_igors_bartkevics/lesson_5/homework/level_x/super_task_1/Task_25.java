/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.

Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
*/
package student_igors_bartkevics.lesson_5.homework.level_x.super_task_1;

public class Task_25 {

    public static void main(String[] args) {

		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthValueFromUser();
		int[] array = arrayUtil.createArray(arrayLength);
		arrayUtil.fillArrayWithNumbers(array);
		arrayUtil.printArrayToConsole(array);
	}
}