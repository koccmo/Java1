package student_vladimir_kobenko.lesson4.homeworks.level_3;
import java.util.Scanner;

public class Task_9 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        double useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        double useNumber2 = scanner.nextInt();

        System.out.println ("Введите число 3");

        double useNumber3 = scanner.nextInt();

        if (useNumber1 < useNumber2 && useNumber2 < useNumber3) {
            System.out.println("Numbers are increasing");
        }

        else if (useNumber1 > useNumber2 && useNumber2 > useNumber3){

                System.out.println("Numbers are decreasing");
        }

        else {
            System.out.println ("Neither all are increasing or decreasing");
        }

    }
}
