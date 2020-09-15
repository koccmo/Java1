package student_volodya_danilin.lesson_3.day_5;

import java.util.Scanner;

public class DogDemo {
    public static void main(String[] Args){
        int age; String color;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("How old is your dog?");
        age = sc1.nextInt();

        System.out.println("What color is your dog?");
        color = sc2.nextLine();

        Dog myDog1 = new Dog("Doggie", age, color);

        myDog1.voice();
        myDog1.happyBirthday();
        myDog1.voice();
        myDog1.changeColor(sc2.nextLine());
        myDog1.voice();

    }
}
