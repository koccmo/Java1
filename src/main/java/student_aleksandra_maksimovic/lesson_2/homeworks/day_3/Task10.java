package student_aleksandra_maksimovic.lesson_2.homeworks.day_3;


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a circle.
        //
        //Test Data:
        //Radius = 7.5
        //
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586


        System.out.println("Enter your radius");
        Scanner myInput = new Scanner(System.in);

		//Названия переменных!! r, pi, s, l .... ????
		// привыкайте давать переменным понятные имена: radius, area, perimeter ....

        double radius = myInput.nextDouble();

        double constPi = 3.1415926535897932384626433832795;

        double area = constPi * radius * radius;
        double perimeter = 2 * constPi * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
