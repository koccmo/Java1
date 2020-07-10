package student_svjatoslavs_cernobrivecs.lesson_5.level_2;

public class Task_14 {

    public static void main(String[] args){
        double[] numbers = new double[3];

        numbers[0] = 1 + (int)(Math.random() * 3);
        numbers[1] = 1 + (int)(Math.random() * 3);
        numbers[2] = 1 + (int)(Math.random() * 3);

        double randomAverage = (numbers[0] + numbers[1] + numbers[2]) / 3;

        System.out.println(randomAverage);
    }
}
