package student_alexey_tretyakov.lesson_8.homework.level_4;

class Task_16_19 {

    // Тесты реализованы через org.junit.Test

    public static void main(String[] args) {
        Circle circle = new Circle("cirle",1);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Square square = new Square("square",3);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        Rectangle rectangle = new Rectangle("rectangle",3, 4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        Triangle triangle = new Triangle("triangle",4);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

    }

}
