package student_jaroslav_brutan.lesson_8.day_6.task_30;

public class Varargs {

    public int sumOfAll(int ... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
}
