package roman.lesson_5.homework.day_4.task_26;

import java.util.Random;
import java.util.Scanner;

public class ArrayNumberFromUserTwo {
    public static void main(String[] args) {
        ArrayNumberFromUserTwo test = new ArrayNumberFromUserTwo();

        int arrayLength = test.getNumberOfMassive();
        int[] array = test.makeArray(arrayLength);
        test.setNumbersOfIndex(array);
        test.printAllMassive(array);
    }

    public int[] makeArray(int arrayLength) {return new int[arrayLength];}

    public int getNumberOfMassive () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of massive :");
        return scanner.nextInt();
    }

    public void setNumbersOfIndex(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void printAllMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of masive [" + i + "] = " + array[i]);
        }
    }
}
