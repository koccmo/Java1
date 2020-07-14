package student_jaroslav_brutan.lesson_2.day_3;
import java.util.Scanner;
public class Task11 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        // давайте переменным более осмысленные и понятные имена
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber + secondNumber + thirdNumber /(double) 3);
    }
}
