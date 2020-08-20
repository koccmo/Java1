package student_roberts_kupcs.lesson_8.homework.level_5.Task_20;

//Создайте класс ShapeUtil.
//В класе ShapeUtil реализуйте метод:
//
//    Circle createRandomCircle();
//
//Этот метод создаёт круг со случайным радиусом.

import java.util.Random;

class ShapeUtil {

        public Circle createRandomCircle() {

        Random rd = new Random();
        double radius = rd.nextInt(10);
        return new Circle("Circle", radius);

    }
}
