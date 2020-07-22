package student_valerija_ionova.lesson_8.level_5;

/*Создайте класс ShapeUtilTest
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
shape[3] = shapeUtil.createRandomTriangle();*/

import student_valerija_ionova.lesson_8.level_4.task_15_19.Shape;

public class ShapeUtilTest {

    public static void main (String [] args){

        ShapeUtilTest test = new ShapeUtilTest();

        test.testOnlyCirclesArea();
        test.testMixPerimeter();
    }

    public void testOnlyCirclesArea(){
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape [3];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomCircle();
        shapes[2] = shapeUtil.createRandomCircle();

        //Random!!
    }

    public void testMixPerimeter(){
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape [3];
        shapes[0] = shapeUtil.createRandomShape();
        shapes[1] = shapeUtil.createRandomShape();
        shapes[2] = shapeUtil.createRandomShape();

        //Random!!
    }
}
