package student_igors_bartkevics.lesson_3.homeworks.day_6;

class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
