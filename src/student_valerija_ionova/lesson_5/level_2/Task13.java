package student_valerija_ionova.lesson_5.level_2;

/*Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

*/

import java.util.Random;

public class Task13 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        int sum = 0;

        for (int number:numbers
             ) {
            sum += number;
        }

        System.out.println("Sum = "+ sum);

    }

}
