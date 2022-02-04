package roman.lesson_5.homework.day_x;

import java.util.Scanner;

public class TestMethod {

    public static void main(String[] args) {
        TestMethod uk = new TestMethod();
        int[] array = new int[uk.getFromUserLengthOfArray()];
        System.out.println(array);
    }

    public int getFromUserLengthOfArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array - ");
        int arrayLength = sc.nextInt();
        return arrayLength;
    }
}
