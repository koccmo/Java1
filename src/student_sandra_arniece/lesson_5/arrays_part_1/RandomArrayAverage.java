package student_sandra_arniece.lesson_5.arrays_part_1;
//Task 14
import java.util.Random;

public class RandomArrayAverage {
    public static void main(String[] args) {
        int[] randomArray = new int[3];
        int arraySum = 0;
        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(10);
            arraySum += randomArray[i];
        }
        System.out.println(arraySum);
        int averageNumber;
        averageNumber = arraySum / randomArray.length;
        System.out.println(averageNumber);
    }
}
