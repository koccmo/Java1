package student_sandra_arniece.lesson_1;
import java.util.*;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        double num1, num2, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to divide and press Enter!");
            num1 = sc.nextInt();

         System.out.println("Input a number to divide by and press Enter!");
            num2 = sc.nextInt();

         sc.close();
        div = num1 / num2;
        System.out.println("The result is: " +div);
    }

}

// I get a double, but  can't enter a double...!? Of course can't check for valid input, or divide by zero X_x