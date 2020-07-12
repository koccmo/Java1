package student_vladimir_kobenko.lesson4.homeworks.level_5;

import java.util.Scanner;

public class LightColorDetector_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter wavelenght: ");
        int wavelenght = sc.nextInt();

        LightColorDetector lightColorDetector = new LightColorDetector();

        String coloroftheLight = lightColorDetector.detect(wavelenght);
        System.out.println("The color is: " + coloroftheLight);
    }
}
