package student_igors_bartkevics.lesson_2.homeworks.day_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int FirstNumber = scanner.nextInt();

        System.out.print("Enter second number:");
        int SecondNumber = scanner.nextInt();

        int sum = FirstNumber + SecondNumber;
        int sub = FirstNumber - SecondNumber;
        int multiple = FirstNumber * SecondNumber;
        int division = FirstNumber / SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + sum);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + sub);
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + multiple);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + division);

    }
}
