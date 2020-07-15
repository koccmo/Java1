package student_sandra_arniece.lesson_4.numbers;
//Task 5
import java.util.Scanner;

public class HighestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int secondNumber = sc.nextInt();
        if(firstNumber > secondNumber){
            System.out.println("The highest entered is: " +firstNumber);
        }
        else if(secondNumber > firstNumber) {
            System.out.println("The highest entered is: " +secondNumber);
        }
        else {
            System.out.println("Entered integers are even!");
        }
    }
}
