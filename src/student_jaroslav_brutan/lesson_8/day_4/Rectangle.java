package student_jaroslav_brutan.lesson_8.day_4;

class Rectangle extends Shape {

    // sides A and C (width) = sides B and D (height)
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}
