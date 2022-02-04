package roman.lesson_5.homework.day_4.task_30;

import java.util.Random;

public class OddNumbersInArray {
    public static void main(String[] args) {
        OddNumbersInArray task = new OddNumbersInArray();
        int lengthOfArray = task.lengthOfArray();
        int[] myArray = task.createArray(lengthOfArray);
        task.fillUpArray(task.createArray(task.lengthOfArray()));
        task.printArray(task.createArray(lengthOfArray));
        task.printOddNumbers(myArray);


    }

    public int[] createArray(int arrayLength) {return new int[arrayLength];}

    public int lengthOfArray() {
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }

    public void fillUpArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Array [" + i + "] = " + array[i]);
        }
    }

    public boolean oddNumberDetector(int number) {
        return number % 2 != 0;
    }

    public void printOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (oddNumberDetector(array[i])) {
                System.out.println("Print odd numbers = " + array[i]);
            }
        }
    }
}
