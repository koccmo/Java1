package student_alexey_tretyakov.lesson_8.homework.level_4;

class Square extends Shape{
    private double side;

    Square(String title,double side) {
        super(title);
        this.side = side;
    }
    @Override
    double calculateArea(){
        return  Math.pow(side, 2 );
    }
    @Override
    double calculatePerimeter(){
        return 4 * side;
    }
}
