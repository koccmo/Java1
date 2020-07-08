package student_alexey_tretyakov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число длины массива = ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for ( int i=0; i< numbers.length; i++){
            System.out.print("Введите целое число для ячейки номер " + ( i+1 ) + " = ");
            numbers[i] = scanner.nextInt();
        }
        for ( int i=0; i < numbers.length; i++ ){
            System.out.println(" Значения  в " + (i+1) + " ячейки = " + numbers[i]);
        }
    }
}
