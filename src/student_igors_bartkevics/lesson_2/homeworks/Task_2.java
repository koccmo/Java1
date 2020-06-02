package student_igors_bartkevics.lesson_2.homeworks;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        float FirstNumber = scanner.nextFloat();

        System.out.print("Enter second number:");
        float SecondNumber = scanner.nextFloat();

        float sum = FirstNumber + SecondNumber;
        float sub = FirstNumber - SecondNumber;
        float multiple = FirstNumber * SecondNumber;
        float dev = FirstNumber / SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + sum);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + sub);
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + multiple);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + dev);

    }
}
