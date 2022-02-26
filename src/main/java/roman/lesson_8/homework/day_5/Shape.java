package roman.lesson_8.homework.day_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public double roundUpDouble(double value) {return (int)(value * 100)/100.0;}

}
