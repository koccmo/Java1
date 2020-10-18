package student_dmitrijs_jasvins.lesson_12.day_4.task_26;


public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        StackOverflowErrorDemo.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}

