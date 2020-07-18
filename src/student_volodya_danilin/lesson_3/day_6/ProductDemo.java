package student_volodya_danilin.lesson_3.day_6;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] Args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is the regular price of product?: ");
        double regularPrice = sc1.nextDouble();

        System.out.println("What is the discount of product?: ");
        double discount = sc2.nextDouble();

        Product shampoo = new Product("Nivea", regularPrice, discount);
        shampoo.actualPrice();
        shampoo.printInformation();
    }
}
