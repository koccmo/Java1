package roman.lesson_3.homework.day_6.task_26;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    public double newArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public void changeRadius(double addRadius){
        this.radius = addRadius;
    }

}
