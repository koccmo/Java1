package student_jaroslav_brutan.lesson_2.day_2;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args){
        Scanner anyInt = new Scanner(System.in);
        System.out.println("What's your name?");
        String username = anyInt.nextLine();
        System.out.println("Hello " + username + "!");


    }
}
