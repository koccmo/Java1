package student_vladimir_kobenko.lesson4.homeworks.level_2;

import java.util.Scanner;

public class Task_6 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        int useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        int useNumber2 = scanner.nextInt();

        if (useNumber1 - useNumber2 < 0) {

            System.out.println("Наименьшее число 1");
        }

        else {
            System.out.println ("Наименьшее число 2");
        }

    }
}
