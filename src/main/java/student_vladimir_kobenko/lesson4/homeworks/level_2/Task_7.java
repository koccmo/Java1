package student_vladimir_kobenko.lesson4.homeworks.level_2;

import java.util.Scanner;

public class Task_7 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        int useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        int useNumber2 = scanner.nextInt();

        if (useNumber1 == useNumber2) {

            System.out.println("Numbers are equals");
        }

        else {
            System.out.println ("Numbers are different");
        }

    }
}
