package student_aleksandra_maksimovic.lesson_5.level_2;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 8;
        numbers[1] = 2;
        numbers[2] = 9;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] : " + numbers[i]);
        }
    }

}
