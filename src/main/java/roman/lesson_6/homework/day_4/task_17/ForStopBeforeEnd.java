package roman.lesson_6.homework.day_4.task_17;

public class ForStopBeforeEnd {
    public static void main(String[] args) {
        ForStopBeforeEnd test = new ForStopBeforeEnd();
        test.stopForBeforeEnd();
    }

    public void stopForBeforeEnd () {
        for (int i = 1; i <= 45; i++) {
            if(!(i % 2 == 0)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
