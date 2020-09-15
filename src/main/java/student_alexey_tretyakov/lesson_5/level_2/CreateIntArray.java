package student_alexey_tretyakov.lesson_5.level_2;

import java.util.Scanner;

public class CreateIntArray {

    public int[] createIntArray ( int inLength ) {
        int [] numbers = new int [inLength];
        Scanner scanner = new Scanner(System.in);
        for ( int i=0; i< numbers.length; i++){
            System.out.print("Введите целое число для ячейки номер " + ( i+1 ) + " = ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printIntArray(int[] inArray) {
        for (int i=0; i< inArray.length; i++){
            System.out.println(" Значения  в " + i + " ячейки = " + inArray[i]);
        }
    }


    public static void main(String[] args) {

        CreateIntArray newArrey = new CreateIntArray();
        int[] myArray = newArrey.createIntArray(3);
        printIntArray ( myArray );

        /* version 1
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for ( int i=0; i< numbers.length; i++){
            System.out.print("Введите целое число для ячейки номер " + ( i+1 ) + " = ");
            numbers[i] = scanner.nextInt();
        }

        for ( int i=0; i < numbers.length; i++ ){
            System.out.println(" Значения  в " + (i+1) + " ячейки = " + numbers[i]);
        }

         */
    }



}
