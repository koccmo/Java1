package student_georgij_galin.Lesson2.Day2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //1.ask user to enter his name
        System.out.println("Hello, enter your name please!");

        //2.get name from user
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //3.print to console
        System.out.println(" Hello " + userName );
        System.out.println(" Nice to meet you!");
    }
}
