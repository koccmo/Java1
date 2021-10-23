package roman.lesson_2.homework.day_3;

import java.util.Scanner;

public class Cyrkle {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Put in radios in double numbers:");
        double numberRadius = scanner.nextDouble();
        double perimetr = numberRadius * 2 * Math.PI;
        double area = Math.PI * Math.pow(numberRadius, 2);

        System.out.println("Your perimetr is : " + perimetr);
        System.out.println("Your area is: " + area);
    }
}
