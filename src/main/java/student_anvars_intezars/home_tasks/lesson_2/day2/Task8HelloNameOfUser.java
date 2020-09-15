package student_anvars_intezars.home_tasks.lesson_2.day2;

import java.util.Scanner;

public class Task8HelloNameOfUser {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your user name");
        System.out.println();
        String userName = in.next();

        System.out.println();
        System.out.println("Hello "  + userName + ("!" ));

    }

}
