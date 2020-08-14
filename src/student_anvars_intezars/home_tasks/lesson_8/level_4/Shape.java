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

    class Square extends Shape {

        private double length;

        Square(double length) {
            this.length = length;
        }
        double calculateArea () {return length * length;}
        double calculatePerimeter() { return 4 * length; }
    }

    class Rectangle extends Shape {

        private double length;
        private double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        double calculateArea() {
            return length * width;
        }
        double calculatePerimeter() {
            return (length + width) * 2;
        }
    }

    class Triangle extends Shape {

        private double basis;
        private double height;
        private double length1;
        private double length2;
        private double length3;

        Triangle(double basis, double height, double length1, double length2, double length3) {
            this.basis = basis;
            this.height = height;
            this.length1 = length1;
            this.length2 = length2;
            this.length3 = length3;
        }
        double calculateArea() {
            return (basis * height) / 2;
        }
        double calculatePerimeter() {
            return length1 + length2 + length3;
        }
    }

