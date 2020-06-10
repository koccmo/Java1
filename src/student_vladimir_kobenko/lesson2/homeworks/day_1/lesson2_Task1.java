package student_vladimir_kobenko.lesson2.homeworks.day_1;

import java.util.Scanner;

public class lesson2_Task1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");

        int userNumberOne = scanner.nextInt();

        System.out.println("Введите число 2");

        int userNumberTwo = scanner.nextInt();

        System.out.println("Сумма чисел 1 и 2 = " + (userNumberOne + userNumberTwo));

        System.out.println("Разница чисел 1 и 2 = " + (userNumberOne - userNumberTwo));

        System.out.println("Произведение чисел 1 и 2 = " + (userNumberOne * userNumberTwo));

        System.out.println("Частное чисел 1 и 2 = " + ((double) userNumberOne / userNumberTwo));
    }

}
