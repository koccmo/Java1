package student_eduards_jasvins.lessoncode;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        /*
        создать массив целых чисел длиной 3
         */
        int[] array = new int[3];
        /*
        заполнить каждую ячейку массива случайным числом
         */
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        /*
        вывести значение каждой ячейки на консоль
         */
        for (int number : array) {
            System.out.println("Numbers = " + number);
        }
        /*
        увеличить значение каждой ячейки на 2 и  вывести значение каждой ячейки на консоль
         */
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
            System.out.println(" Numbers Array + 2 = " + array[i]);

        }
        /*
        посчитать сумму всех ячеек и вывести ее на консоль
         */
        int sum = 0;
        for (int arraySum : array) {
            sum += arraySum;
        }
        System.out.println("array sum = " + sum);
        /*
        посчитать среднее значение и вывести его на консоль.
         */
        double average = (double) sum / array.length;
        System.out.println("Average = " + average);
    }
}

