package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    Triangle(String title, double side1, double side2, double side3) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(calculatePerimeter() * (calculatePerimeter() - side1) *
                (calculatePerimeter() - side2) * (calculatePerimeter() - side3));
    }

}
