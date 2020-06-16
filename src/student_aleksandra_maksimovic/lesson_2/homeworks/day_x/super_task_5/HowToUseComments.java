package student_aleksandra_maksimovic.lesson_2.homeworks.day_x.super_task_5;

import java.util.Scanner;

public class HowToUseComments {

  /*  Напишите программу и продемонстрируйте в ней использование
    однострочного и многострочного коментариев.*/

    public static void main(String[] args) {

        System.out.println("Enter your string");
        Scanner input = new Scanner(System.in);
        String myStr = input.nextLine();


        for( int i = 0; i < myStr.length(); i++ ) {


            char result = myStr.charAt(i);//method returns the character at the specified index in a string.
            System.out.println(result);


        }

        /*System.out.println("Goodbye! Have a nice day! ");*/     // Uncomment this code, to sаy goodbay!
    }


}
