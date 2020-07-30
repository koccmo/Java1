package student_valerija_ionova.lesson_5.level_2;

/*Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.

*/

import java.util.Random;

class Task12 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        for (int number:numbers
             ) {
            System.out.print(number+" ");
        }

    }

}
