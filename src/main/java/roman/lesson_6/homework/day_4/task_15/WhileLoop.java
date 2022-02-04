package roman.lesson_6.homework.day_4.task_15;

public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop test = new WhileLoop();
        test.endLess();
    }
    public void endLess () {
        int a = 2;
        while (a > 1) {
            System.out.println("Pip ");
            System.out.println("Pop ");
            a++;
        }
    }
}
