package student_sandra_arniece.lesson_3;
//Task 25
public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = (Math.PI * radius * radius);
        System.out.println(area);
    }

}
