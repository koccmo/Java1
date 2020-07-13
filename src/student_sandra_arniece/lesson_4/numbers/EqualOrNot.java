package student_sandra_arniece.lesson_4.numbers;
//Task 7
import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int firstInteger = sc.nextInt();
        System.out.println("Enter second integer: ");
        int secondInteger = sc.nextInt();
        if (firstInteger == secondInteger){
            System.out.println("Numbers are equal");
        }
        else{
            System.out.println("Numbers are different");
        }
    }
}
