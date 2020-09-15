package student_alexey_tretyakov.lesson_5.level_x.Super_task_1;

import student_alexey_tretyakov.lesson_5.level_5_6.ArrayUtil;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число длины массива = ");
        int arrayLength = scanner.nextInt();

        ArrayUtil newNumbers = new ArrayUtil();

        //int[] numbers = new int[arrayLength];
        int [] numbers = newNumbers.createArray(arrayLength);

        /*Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + numbers[i]);
        } */
        numbers = newNumbers.fillArrayWithRandomNumbers( numbers );
        newNumbers.printArrayToConsole( numbers );
    }
}
