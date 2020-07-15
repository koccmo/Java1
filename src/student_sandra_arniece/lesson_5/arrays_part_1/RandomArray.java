package student_sandra_arniece.lesson_5.arrays_part_1;
//Task 12
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomArray = new int[3];
        Random randomNumber = new Random();
        for (int i = 0; i < 3; i++){
            randomArray[i] = randomNumber.nextInt(99);
        }
        Arrays.stream(randomArray).forEach(System.out::println);
    }
}
