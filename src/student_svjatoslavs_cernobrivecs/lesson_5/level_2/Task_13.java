package student_svjatoslavs_cernobrivecs.lesson_5.level_2;

public class Task_13 {

    public static void main(String[] args){
        int[] numbers = new int[3];

        numbers[0] = 1 + (int)(Math.random() * 3);
        numbers[1] = 1 + (int)(Math.random() * 3);
        numbers[2] = 1 + (int)(Math.random() * 3);

        System.out.println(numbers[0] + numbers[1] + numbers[2]);
    }
}
