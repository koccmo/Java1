package student_alexey_tretyakov.lesson_8.homework.level_4;

class Triangle extends Shape {

    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }
    @Override
    double calculateArea(){
        return   Math.pow(side, 2 ) * Math.sqrt(3) / 4;
    }
    @Override
    double calculatePerimeter(){
        return  3 * side;
    }

}
