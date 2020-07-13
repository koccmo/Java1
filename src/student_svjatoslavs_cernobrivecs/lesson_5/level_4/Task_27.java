package student_svjatoslavs_cernobrivecs.lesson_5.level_4;

public class Task_27 {

    public static void main(String[] args){

        int[] numbers = new int[10];

        for(int i = 1; i < numbers.length; i++){
            numbers[i] = 1 + (int)(Math.random()*10);
            System.out.println("[" + i + "]" + numbers[i]);
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Biggest number is: " + max);
    }
}
