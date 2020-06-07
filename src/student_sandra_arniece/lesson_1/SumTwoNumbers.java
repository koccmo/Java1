package student_sandra_arniece.lesson_1;
import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first integer and press Enter!");
        num1 = sc.nextInt();

        System.out.println("Input the second integer and press Enter!");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("The sum is: \n"+sum);
    }
}
// Could not figure out how to handle empty input, sum that's bigger than an integer and non integer input...
// 74 + 36 surely works ;)