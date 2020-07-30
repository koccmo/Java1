package student_sandra_arniece.lesson_3.level_2;

import java.util.Scanner;

class StringTasks {

    public static void main(String[] args) {
        //Task 7
        String myName = "Sandra";
        System.out.println(myName);

        //Task 8
        String userName = "User";
        String greeting = "Hi, " + userName + "!";
        System.out.println(greeting);

        //Task 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what's your name?");

        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
