/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
*/
package student_igors_bartkevics.lesson_5.homework.level_4;

import java.util.Scanner;
import java.util.Random;
public class Task_26 {

    public static void main(String[] args) {

        Task_26 task = new Task_26();
        int arrayLength = task.getArrayLengthValueFromUser();
        int[] array = task.createArray(arrayLength);
        task.fillArrayWithRandomNumbers(array);
        task.printArrayOnScreen(array);
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int getArrayLengthValueFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        return scanner.nextInt();
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void printArrayOnScreen(int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            System.out.println("Array[" + i + "] : " + array[i]);
        }
    }
}
