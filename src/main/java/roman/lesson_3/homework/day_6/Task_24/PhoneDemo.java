package roman.lesson_3.homework.day_6.Task_24;

import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number for call : ");
        int tutu = sc.nextInt();

        Phone mobile = new Phone("Iphone","Grey");
        mobile.call(tutu);

        System.out.print("Enter your number: ");
        int yourNumber = sc.nextInt();
        System.out.print("Enter your text: ");
        String yourText = sc.next();
        String textDone = mobile.text(yourNumber,yourText);
        System.out.println(textDone);




    }
}
