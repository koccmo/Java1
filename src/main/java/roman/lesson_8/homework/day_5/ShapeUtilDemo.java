package roman.lesson_8.homework.day_5;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        System.out.println("Circle");
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea);
        System.out.println(circlePerimeter);

        System.out.println("----------------------------------------");

        System.out.println("Triangle");
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println(triangleArea);
        System.out.println(trianglePerimeter);

        System.out.println("------------------------------------------------");

        System.out.println("Square");
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println(squareArea);
        System.out.println(squarePerimeter);

        System.out.println("---------------------------------------------------");

        System.out.println("Rectangle");
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
    }
}
