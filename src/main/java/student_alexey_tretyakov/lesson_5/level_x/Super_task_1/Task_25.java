package student_alexey_tretyakov.lesson_5.level_x.Super_task_1;

import student_alexey_tretyakov.lesson_5.level_5_6.ArrayUtil;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число длины массива = ");
        int arrayLength = scanner.nextInt();
        ArrayUtil newNumbers = new ArrayUtil();

        //int[] numbers = new int[arrayLength];
        int [] numbers = newNumbers.createArray(arrayLength);

        for ( int i=0; i< numbers.length; i++){
            System.out.print("Введите целое число для ячейки номер " + ( i+1 ) + " = ");
            numbers[i] = scanner.nextInt();
        }

        /*for ( int i=0; i < numbers.length; i++ ){
            System.out.println(" Значения  в " + (i+1) + " ячейки = " + numbers[i]);
        } */
        newNumbers.printArrayToConsole( numbers );
    }
}
