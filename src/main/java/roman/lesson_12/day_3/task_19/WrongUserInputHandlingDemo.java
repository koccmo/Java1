package roman.lesson_12.day_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
       while (true) {
           try {
               System.out.println("Enter Integer number!");
               Scanner scanner = new Scanner(System.in);
               scanner.nextInt();
               break;
           } catch (InputMismatchException o) {
               System.out.println("It not Number!");
           }
       }
    }
}
