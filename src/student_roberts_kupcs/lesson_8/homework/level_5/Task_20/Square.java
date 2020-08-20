package student_roberts_kupcs.lesson_8.homework.level_5.Task_20;

class Square extends Shape {
    private double side;


    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;

    }
}
