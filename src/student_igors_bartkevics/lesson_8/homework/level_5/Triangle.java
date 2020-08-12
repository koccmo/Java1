package student_igors_bartkevics.lesson_8.homework.level_5;

class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(String title, double firstSide, double secondSide, double thirdSide) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    double calculateArea() {
        double halfOfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide) *
                (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));
        return roundUpDouble(area);
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(firstSide + secondSide + thirdSide);
    }
}

