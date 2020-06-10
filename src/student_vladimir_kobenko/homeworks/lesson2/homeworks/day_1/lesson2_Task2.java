package student_vladimir_kobenko.homeworks.lesson2.homeworks.day_1;

import java.util.Scanner;

public class lesson2_Task2 {

     public static void main (String [] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Введите вещественное число 1");

         double userNumberOne = scanner.nextDouble();

         System.out.println("Введите вещественное число 2");

         double userNumberTwo = scanner.nextDouble();

         System.out.println("Сумма чисел 1 и 2 = " + (userNumberOne + userNumberTwo));

         System.out.println("Разница чисел 1 и 2 = " + (userNumberOne - userNumberTwo));

         System.out.println("Произведение чисел 1 и 2 = " + (userNumberOne * userNumberTwo));

         System.out.println("Частное чисел 1 и 2 = " + (userNumberOne / userNumberTwo));
        }

    }
