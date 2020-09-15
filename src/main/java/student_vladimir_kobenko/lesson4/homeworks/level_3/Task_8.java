package student_vladimir_kobenko.lesson4.homeworks.level_3;
// Write a Java program that accepts three numbers and prints:
//        - "All numbers are equal" if all three numbers are equal,
//        - "All numbers are different" if all three numbers are different
//        - "Neither all are equal or different" otherwise.
import java.util.Scanner;

public class Task_8 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        double useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        double useNumber2 = scanner.nextInt();

        System.out.println ("Введите число 3");

        double useNumber3 = scanner.nextInt();

        if (useNumber1 == useNumber2) {
            if (useNumber1 == useNumber3)

            System.out.println("Numbers are equals");
        }

        else if ((useNumber1 != useNumber2) && (useNumber2 != useNumber3) && (useNumber1!= useNumber3)){

                System.out.println("Numbers are different");
        }

        else {
            System.out.println ("Neither all are equal or different");
        }

    }
}
