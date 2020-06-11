package student_igors_bartkevics.lesson_2.homeworks.day_2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Hello + name");

        // 1. get name from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter your name: ");
        String Name = myInput.next();

        // 2. print result to console
        System.out.println("Hello " + Name);
    }
}