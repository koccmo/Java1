package student_valerija_ionova.lesson_2;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class Task_11 {
    public static void main (String[] args){

        System.out.println("Программа запрашивает 3 числа и считает среднее арифметическое");

        // 1.Input
        Scanner myInput= new Scanner (System.in);
        System.out.println("Введите первое число: ");
        double first = myInput.nextDouble();
        System.out.println("Введите второе число: ");
        double second = myInput.nextDouble();
        System.out.println("Введите третье число: ");
        double third = myInput.nextDouble();

        //2.Calculation
        double result = (first+second+third)/3;

        System.out.println("Среднее арифметическое: "+result);

    }
}
