package student_georgij_galin.Homeworks.Lesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int FirstNumber;
        int SecondNumber;
        try (var scanner = new Scanner(System.in)) {

            System.out.print("Enter first number:");
            FirstNumber = scanner.nextInt();

            System.out.print("Enter second number:");
            SecondNumber = scanner.nextInt();
        }

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