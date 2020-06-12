package student_anvars_intezars.home_tasks.lesson_2.day2;

import java.util.Scanner;

public class Phone {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("My Contact List:");
        System.out.println ("To Add New Contact, please enter the details");

            System.out.println();
            System.out.println("Name");
            String name = in.next();

            System.out.println();
            System.out.println("Surname");
            String surname = in.next();

            System.out.println();
            System.out.println("Place of work");
            String placeOfWork = in.next();

            System.out.println();
            System.out.println("Phone number");
            long phoneNumber = in.nextLong();

                System.out.println();
                System.out.println ("The new contact is added");
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Work Place: " + placeOfWork);
                System.out.println("Phone number: " + phoneNumber);}

}
