package student_dmitrijs_jasvins.lesson_5.day_2;

//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - посчитать среднее значение и вывести его на консоль.


import java.util.Random;

class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("Average = " + average);
    }

}
