package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

import java.util.Random;

class ShapeUtil {

    Random rd = new Random();

    Circle createRandomCircle(){
        double radius = (rd.nextDouble() + 0.1) * 20;
        return new Circle("Circle", radius);
    }

    Square createRandomSquare (){
        double side = (rd.nextDouble() + 0.1) * 20;
        return new Square("Square", side);
    }

    Rectangle createRandomRectangle (){
        double side1 = (rd.nextDouble() + 0.1) * 20;
        double side2 = (rd.nextDouble() + 0.1) * 30;
        return new Rectangle("Rectangle", side1, side2);
    }

    Triangle createRandomTriangle (){
        double side = (rd.nextDouble() + 0.1) * 20;
        return new Triangle("Triangle", side, side, side);
    }

    Shape createRandomShape () {
        switch (rd.nextInt(3)) {
            case 1:
                return createRandomCircle();
            case 2:
                return createRandomSquare();
            case 3:
                return createRandomRectangle();
        }
        return createRandomTriangle();
    }

    double calculateArea (Shape [] shapes){
        double area = 0;
        for (int i = 0; i < shapes.length; i ++){
            area += shapes[i].calculateArea();
        }
        return area;
    }

    double calculatePerimeter (Shape [] shapes){
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++){
            perimeter += shapes[i].calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea (Shape shape){
        return shape.calculateArea();
    }

    double calculatePerimeter (Shape shape){
        return shape.calculatePerimeter();
    }
}
