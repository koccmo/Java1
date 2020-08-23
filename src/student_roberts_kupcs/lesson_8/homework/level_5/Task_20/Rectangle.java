package student_roberts_kupcs.lesson_8.homework.level_5.Task_20;

class Rectangle extends Shape {
    private int side1;
    private int side2;

    public Rectangle(String title, int side1, int side2) {

        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        //s=a*b;
        return side1 * side2;
    }

    @Override
    double calculatePerimeter() {
        //p=2a+2b;
        return 2 * side1 + 2 * side2;
    }
}
