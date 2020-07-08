package student_alexey_tretyakov.lesson_5.level_x.Super_task_1;

import student_alexey_tretyakov.lesson_5.level_5_6.ArrayUtil;

public class Task_27 {
    public static void main(String[] args) {

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
        /*int maxInt = numbers[0];
        for (int number : numbers) {
            if (number >= maxInt) maxInt = number;
        } */
        System.out.println(" Наибольшее значение массива = " + newNumbers.findMaxNumber( numbers ));
    }


}
