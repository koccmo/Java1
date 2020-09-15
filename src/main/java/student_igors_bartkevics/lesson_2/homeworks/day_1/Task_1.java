package student_igors_bartkevics.lesson_2.homeworks.day_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        // названия переменных с маленькой буквы
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number:");
		// названия переменных с маленькой буквы
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multiple = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiple);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

    }
}
