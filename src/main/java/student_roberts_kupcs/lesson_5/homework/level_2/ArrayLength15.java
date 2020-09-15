package student_roberts_kupcs.lesson_5.homework.level_2;

import java.util.Random;

//Написать программу, в которой:
// - создать массив целых чисел длиной 3,
// - заполнить каждую ячейку массива случайным числом,
// - вывести значение каждой ячейки на консоль,
// - увеличить значение каждой ячейки на 2,
// - вывести значение каждой ячейки на консоль.

class ArrayLength15 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] myNum = new int[3];
        myNum[0] = rand.nextInt(10);
        myNum[1] = rand.nextInt(10);
        myNum[2] = rand.nextInt(10);

        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);

        for (int i = 0; i < myNum.length; i++) {
            myNum[i] = myNum[i] + 2;
        }
        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
    }
}
