package roman.lesson_6.homework.day_4.task_16;

public class WhileStopEndLessLoop {
    public static void main(String[] args) {
        WhileStopEndLessLoop test = new WhileStopEndLessLoop();
        test.breakEndLessLoop();
    }
    public void breakEndLessLoop () {
        int a = 1;
        while (a > 0) {
            System.out.println("End Less Loop");
            System.out.println(a);
            if (a == 100) {
                System.out.println("Stop Loop");
                break;
            }
            a++;
        }
    }
}
