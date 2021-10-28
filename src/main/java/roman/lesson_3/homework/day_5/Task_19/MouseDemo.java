package roman.lesson_3.homework.day_5.Task_19;

public class MouseDemo {
    public static void main(String[] args){
        Mouse mouse = new Mouse("Didi","Grey",7);
        String squeak = mouse.squeak();
        System.out.println(squeak);
    }
}
