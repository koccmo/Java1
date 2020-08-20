package student_roberts_kupcs.lesson_8.homework.level_4.Task_19;

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double height;

    public Triangle(String title, double side1, double side2, double side3) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String title, double side1, double height) {
        super(title);
        this.side1 = side1;
        this.height = height;
    }

    @Override
    double calculateArea() {
        //a=(height*width) / 2
        return (side1 * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        //p=a+b+c
        return side1 + side2 + side3;
    }
}
