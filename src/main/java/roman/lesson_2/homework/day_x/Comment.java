package roman.lesson_2.homework.day_x;

import java.util.Scanner;

public class Comment {
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        //Int peremenie
        System.out.print("Enter your first number: ");
        int x = input.nextInt();
        // int peremenaja
        System.out.print("Enter your second number : ");
        int y = input.nextInt();
        float z = (float) x/y;
        /* Eto mnogo stro4nie komentarii
        ehuuuuu
         */
        System.out.println("This is answer : " + z);
    }
}
