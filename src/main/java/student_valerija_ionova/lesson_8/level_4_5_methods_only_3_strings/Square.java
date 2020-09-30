package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

class Square extends Shape{

    private double side;

    Square (String title, double side){
        super (title);
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
