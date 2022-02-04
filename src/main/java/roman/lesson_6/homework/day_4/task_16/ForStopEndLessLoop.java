package roman.lesson_6.homework.day_4.task_16;

public class ForStopEndLessLoop {
    public static void main(String[] args) {
        ForStopEndLessLoop test = new ForStopEndLessLoop();
        test.stopForEndLessLoop();
    }

    public void stopForEndLessLoop () {
        for (int i = 0; i > -1; i++) {
            System.out.println("End Less loop FOR " + i);
            if (i == 100) {
                System.out.println("Loop End i == " + i);
                break;
            }
        }
    }
}
