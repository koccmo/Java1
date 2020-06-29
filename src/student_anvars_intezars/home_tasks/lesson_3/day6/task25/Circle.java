package student_anvars_intezars.home_tasks.lesson_3.day6.task25;

public class Circle {

    private double radius;
    public double numberP;

    public double getRadius() {
        return radius;
    }

    public double getNumberP() {
        return numberP = 3.14;
    }
    public void setRadius(double radius){
        this.radius = radius;
        }

   public double calculateArea() {
        return radius * radius * getNumberP();
    }
}
