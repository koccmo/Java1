package student_vladimir_kobenko.lesson4.homeworks.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        int useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        int useNumber2 = scanner.nextInt();

        if (useNumber2 - useNumber1 < 0) {

            System.out.println("Наибольшее число 1");
        }

        else {
            System.out.println ("Наибольшее число 2");
        }

    }
}
