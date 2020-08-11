package student_igors_bartkevics.lesson_8.homework.level_6;

public class Task_30 {

    public int sumOfVarArgs(int...values) {
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task_30 task = new Task_30();
        System.out.println("Sum of 4 variable arguments = " + task.sumOfVarArgs(2,5,6,1));
        System.out.println("Sum of 2 variable arguments = " + task.sumOfVarArgs(2,5));
        System.out.println("Sum of 1 variable argument = " + task.sumOfVarArgs(2));
        System.out.println("Sum of 0 variable arguments = " + task.sumOfVarArgs());

    }

}
