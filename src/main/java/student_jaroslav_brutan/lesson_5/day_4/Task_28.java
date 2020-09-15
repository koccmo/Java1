package student_jaroslav_brutan.lesson_5.day_4;

import java.util.Random;

public class Task_28 {
    public static void main(String[] args) {
        int[] randomNum = new int[7];
        Random random = new Random();
        for (int i = 0; i < randomNum.length;i++){
            randomNum[i] = random.nextInt(60);
        }
        for (int i = 0; i < randomNum.length;i++){
            System.out.println("[" + i + "] = " + randomNum[i]);
        }
        int minNum = randomNum[0];
        for (int i : randomNum){
            if (i < minNum){
                minNum=i;
            }
        }
        System.out.println("Min random number is " + minNum);
    }
}
