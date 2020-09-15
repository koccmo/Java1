package student_valerija_ionova.lesson_1;

//Write a Java program to print 'Hello'
//on screen and then print your name on a separate line.

import java.util.Scanner;

class Task10_with_input {
    public static void main (String[] args){
        // 1. get name from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter name: ");
        String name = myInput.next();

        // 2. print result to console
        System.out.println("Hello");
        System.out.println(name);
    }
}
