package student_anvars_intezars.home_tasks.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {

    public static void recursivePrint(int num ) {
        System.out.println("Number: " + num);

        if (num == 0) {
            return;
        } else {
            recursivePrint(++num);
        }
    }

    public static void main(String[] args) {
        StackOverflowErrorDemo.recursivePrint(1);

    }
}
