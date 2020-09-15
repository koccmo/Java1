package student_svjatoslavs_cernobrivecs.lesson_5.level_4;

public class Task_28 {

    public static void main(String[] args){

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = 1 + (int)(Math.random() * 20);
            System.out.println("[" + i + "]" + numbers[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + min);
    }
}
