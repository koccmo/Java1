package student_vladimir_kobenko.lesson4.homeworks.level_1;

import java.util.Scanner;

public class Task_3 {

    public static void main (String [] args){

        System.out.println ("Введите число от 1 до 7 ");

        Scanner scanner = new Scanner(System.in);

        int useNumber = scanner.nextInt();

        if (useNumber == 1) {

            System.out.println("Monday");
        }

        else if (useNumber == 2){

            System.out.println("Tuesday");
        }
        else if (useNumber == 3){

            System.out.println("Wednesday");
        }
        else if (useNumber == 4){

            System.out.println("Thurssday");
        }
        else if (useNumber == 5){

            System.out.println("Friday");
        }
        else if (useNumber == 6){

            System.out.println("Saturtday");
        }
        else {
            System.out.println ("Sunday");
        }

    }
}
