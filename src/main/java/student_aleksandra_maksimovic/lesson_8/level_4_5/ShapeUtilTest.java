package student_aleksandra_maksimovic.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

/*
    Создайте класс ShapeUtilTest
    и напишите тесты для методов:

        double calculateArea(Shape[] shapes);
        double calculatePerimeter(Shape[] shapes);

    PS: пример создания и заполнения массива
    геометрических фигур:

    ShapeUtil shapeUtil = new ShapeUtil();
    Shape[] shapes = new Shape[4];
    shape[0] = shapeUtil.createRandomCircle();
    shape[1] = shapeUtil.createRandomSquare();
    shape[2] = shapeUtil.createRandomRectangle();
    shape[3] = shapeUtil.createRandomTriangle();
    */
@CodeReview(approved = true)
public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaTest();
    }

    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();

    }


}