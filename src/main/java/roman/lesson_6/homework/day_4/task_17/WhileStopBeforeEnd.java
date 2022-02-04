package roman.lesson_6.homework.day_4.task_17;

public class WhileStopBeforeEnd {
    public static void main(String[] args) {
        WhileStopBeforeEnd test = new WhileStopBeforeEnd();
        test.stopWhileBeforeEnd();
    }

    public void stopWhileBeforeEnd () {
        int a = 0;
        while (a < 10) {
            if (a == 4) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("It finish!!!");
    }
}
