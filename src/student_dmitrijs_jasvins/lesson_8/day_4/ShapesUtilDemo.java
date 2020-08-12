package student_dmitrijs_jasvins.lesson_8.day_4;

public class ShapesUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea);
        System.out.println(circlePerimeter);

        ShapeUtil shapeUtil1 = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil1.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil1.calculatePerimeter(rectangle);
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
    }
}
