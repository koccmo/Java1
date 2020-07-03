package student_valerija_ionova.lesson_5.level_2;

/*Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.

*/

import java.util.Random;

public class Task14 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
            sum += numbers[i];
        }

        double result = (double)sum / numbers.length;

        System.out.println("Result = "+ result);

    }

}
