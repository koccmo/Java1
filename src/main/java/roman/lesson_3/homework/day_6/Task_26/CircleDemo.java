package roman.lesson_3.homework.day_6.Task_26;

public class CircleDemo {
    public static void main(String[] args){
        Circle cr = new Circle(3.4);
        double area = cr.calculateArea();
        System.out.println(area);
        double superArea = cr.newarea();
        System.out.println(superArea);
    }
}
