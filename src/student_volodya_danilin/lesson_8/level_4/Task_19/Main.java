package student_volodya_danilin.lesson_8.level_4.Task_19;

public class Main {
    public static void main(String[] Args) {

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Straight angle triangle");
        triangle1.printSides();
        System.out.println("Area is : " + triangle1.calculateArea());
        System.out.println("Perimeter is : " + triangle1.calculatePerimeter());

        System.out.println();

        Triangle triangle2 = new Triangle(5, 5, 8);
        System.out.println("2 sides equal triangle");
        triangle2.printSides();
        System.out.println("Area is : " + triangle2.calculateArea());
        System.out.println("Perimeter is : " + triangle2.calculatePerimeter());

        System.out.println();

        Triangle triangle3 = new Triangle(4, 4, 4);
        System.out.println("All sides equal triangle");
        triangle3.printSides();
        System.out.println("Area is : " + triangle3.calculateArea());
        System.out.println("Perimeter is : " + triangle3.calculatePerimeter());

        System.out.println();

        Triangle triangle4 = new Triangle(4, 5, 6);
        System.out.println("All sides unequal triangle/Heron's formula triangle");
        triangle4.printSides();
        System.out.println("Area is : " + triangle4.calculateArea());
        System.out.println("Perimeter is : " + triangle4.calculatePerimeter());

    }
}
