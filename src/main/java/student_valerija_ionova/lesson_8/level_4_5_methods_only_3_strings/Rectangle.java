package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

class Rectangle extends Shape{

    private double side1;
    private double side2;

    Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculatePerimeter() {
        return (side2 + side1) * 2;
    }

    @Override
    double calculateArea() {
        return side1 * side2;
    }
}
