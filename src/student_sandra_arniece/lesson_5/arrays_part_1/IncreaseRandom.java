package student_sandra_arniece.lesson_5.arrays_part_1;
//Task 15
import java.util.Random;
import java.util.Arrays;

public class IncreaseRandom {
    public static void main(String[] args) {
        int[] randomArray = new int[3];
        Random randomNumber = new Random();
        for (int i = 0; i < 3; i++){
            randomArray[i] = randomNumber.nextInt(99);
        }
        System.out.println(Arrays.toString(randomArray));
        for(int i = 0; i < 3; i++) {
            randomArray[i] += 2;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
