package student_alexey_tretyakov.lesson_5.level_x.Super_task_1;

import student_alexey_tretyakov.lesson_5.level_5_6.ArrayUtil;

import java.util.Random;

public class Task_29 {
    public static void main(String[] args) {

        //int[] numbers = new int[10];
        int arrayLength = 10;
        ArrayUtil newNumbers = new ArrayUtil();
        int [] numbers = newNumbers.createArray( arrayLength );

        /*Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + numbers[i]);
        } */
        numbers = newNumbers.fillArrayWithRandomNumbers( numbers );
        newNumbers.printArrayToConsole( numbers );

        /*for (int i = 0; i < numbers.length; i++) {
            if (( numbers[i] % 2) == 0 ) {
                System.out.println(" Чётное значение  в " + (i + 1) + " ячейке = " + numbers[i]);
            }
        } */
        newNumbers.printEvenNumber( numbers );
    }
}
