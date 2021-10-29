package roman.lesson_3.homework.day_6.Task_26;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

    public double newarea(){
        return Math.PI * Math.pow(radius,2);
    }
}
