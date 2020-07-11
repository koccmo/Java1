package student_alexey_tretyakov.lesson_5.level_x.Super_task_1;

import student_alexey_tretyakov.lesson_5.level_5_6.ArrayUtil;

public class Task_30 {
    public static void main(String[] args) {
        int arrayLength = 10;
        ArrayUtil newNumbers = new ArrayUtil();
        int[] numbers = newNumbers.createArray(arrayLength);
        numbers = newNumbers.fillArrayWithRandomNumbers( numbers );
        newNumbers.printArrayToConsole( numbers );
        newNumbers.printOddNumber( numbers );
    }
}
