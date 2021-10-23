package roman.lesson_2.homework.day_1;

import javax.swing.*;
import java.util.Scanner;

public class Task_2 {
    public static void main(String [] args){
      Scanner input = new Scanner( System.in );
      System.out.println(" Input first number: ");
      double firstPoint = input.nextDouble();
      System.out.println(" Input second number: ");
      double secondPoint = input.nextDouble();

      System.out.println("Double number summa result: " + firstPoint + " + " + secondPoint + " = " + (firstPoint + secondPoint) );
      System.out.println("Double number minus result: " + firstPoint + " - " + secondPoint + " = " + (firstPoint - secondPoint) );
      System.out.println("Double number double result: " + firstPoint + " x " + secondPoint + " = " + (firstPoint * secondPoint) );
      System.out.println("Double number devide result: " + firstPoint + " : " + secondPoint + " = " + (firstPoint / secondPoint) );




    }
}
