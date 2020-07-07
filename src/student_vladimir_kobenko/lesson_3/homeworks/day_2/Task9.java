package student_vladimir_kobenko.lesson_3.homeworks.day_2;

import java.util.Scanner;

public class Task9 {
    public static void main (String[]args){
        System.out.println("Please enter your name:");
        Scanner myInput = new Scanner(System.in);
        String userName = myInput.next();
        System.out.println("Hello!" + userName);
    }
}
