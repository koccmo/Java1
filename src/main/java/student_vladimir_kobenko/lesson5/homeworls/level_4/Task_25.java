package student_vladimir_kobenko.lesson5.homeworls.level_4;
// - запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int arrayLenght = sc.nextInt();

        int[] array = new int[arrayLenght];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            int arrayElement = sc.nextInt();
            array[i] = arrayElement;
        }
        System.out.println("Элементы массива");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
