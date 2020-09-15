package student_volodya_danilin.lesson_3.day_6;

import java.util.Scanner;

public class BoatDemo {
    public static void main(String[] Args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        String name;
        String color;
        int price;

        System.out.println("What is the make of your boat?");
        name = sc1.nextLine();

        System.out.println("What is the color of your boat?");
        color = sc2.nextLine();

        System.out.println("How much does your boat cost?");
        price = sc3.nextInt();

        Boat myBoat1 = new Boat(name,color, price);

        myBoat1.boatInfo();
    }
}
