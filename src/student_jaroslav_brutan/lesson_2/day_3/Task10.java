package student_jaroslav_brutan.lesson_2.day_3;
import java.awt.desktop.SystemSleepListener;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
               System.out.println("Enter radius 7,5");
               double area, perimeter;
               double radius = scanner.nextDouble();
               area = Math.PI * radius * radius;
               System.out.println("Area = " + area);
               perimeter = 2 * Math.PI * radius;
               System.out.println("perimeter = " + perimeter);

    }
}
