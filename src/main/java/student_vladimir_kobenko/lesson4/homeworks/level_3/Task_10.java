package student_vladimir_kobenko.lesson4.homeworks.level_3;
import java.util.Scanner;

public class Task_10 {

    public static void main (String [] args){

        System.out.println ("Введите число 1");

        Scanner scanner = new Scanner(System.in);

        int useNumber1 = scanner.nextInt();

        System.out.println ("Введите число 2");

        int useNumber2 = scanner.nextInt();

        System.out.println ("Введите число 3");

        int useNumber3 = scanner.nextInt();

        if (useNumber1 >= useNumber2 && useNumber1 >= useNumber3) {
            System.out.println("The biggest number is # 1");
        }
        else if (useNumber2 >= useNumber3 && useNumber2 >= useNumber1) {
            System.out.println("The biggest number is # 2");
        }
        else System.out.println("The biggest number is # 3");
    }
}

