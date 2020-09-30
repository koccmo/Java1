package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

class Circle extends Shape{

    private double radius;

    Circle (String title, double radius){
        super (title);
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
