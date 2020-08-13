package student_anvars_intezars.home_tasks.lesson_8.level_4;

abstract class Shape {

    private double radius;
    private String title;

    Shape(String title, double radius) {
        this.title = title;
        this.radius = radius;
    }

    public Shape() {

    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
    }

    class Circle extends Shape {

        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double calculateArea() {
            return 3.14 * radius * radius;
        }
        double calculatePerimeter() {
            return 2 * 3.14 * radius;
        }
    }

