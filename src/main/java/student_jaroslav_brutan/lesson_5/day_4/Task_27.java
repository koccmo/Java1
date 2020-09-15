package student_jaroslav_brutan.lesson_5.day_4;

import java.util.Random;

public class Task_27 {
    public static void main(String[] args) {
        int[] randomNum = new int[4];
        Random random = new Random();
        for (int i = 0; i < randomNum.length;i++){
            randomNum[i] = random.nextInt(100);
        }
        for (int i = 0; i < randomNum.length;i++){
            System.out.println("[" + i + "] = " + randomNum[i]);
        }
        int maxNum = randomNum[0];
        for (int i : randomNum){
            if (i > maxNum){
                maxNum=i;
            }
        }
        System.out.println("Max random number is " + maxNum);
    }
}
