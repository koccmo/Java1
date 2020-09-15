package student_jaroslav_brutan.lesson_6.day_4;

public class Task_16_WhileBreak {

    public static void main(String[] args) {
        int i = 7;
        while(i>6){
            System.out.println("It's looping");
            if (i == 100){
                System.out.println("Loop is finished");
                break;
            } i++;
        }
    }
}
