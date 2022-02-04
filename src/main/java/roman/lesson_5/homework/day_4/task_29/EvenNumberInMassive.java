package roman.lesson_5.homework.day_4.task_29;

import java.util.Random;

public class EvenNumberInMassive {
    public static void main(String[] args) {
        EvenNumberInMassive even = new EvenNumberInMassive();

        Random random = new Random();
        int arrayLength = random.nextInt(10);
        int[] mudak = even.makeArray(arrayLength);
        int[] poluPokerok = {1,2,3,4,5};
        even.printArrayInLane(poluPokerok);
        even.setArrayValue(mudak);
        even.printArray(mudak);
        even.printEvenNumbers(mudak);



    }

    public int[] makeArray(int arrayLength) {return new int[arrayLength];}

    public void setArrayValue(int[] boxOfEggs) {
        Random random = new Random();
        for (int i = 0; i < boxOfEggs.length; i++) {
            boxOfEggs[i] = random.nextInt(10);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0;  i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }

    public void printEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    public boolean isEven (int number) {
        return number % 2 == 0;
    }

    public void printArrayInLane(int[] array) {
        String start = "Array(";
        String end = ")";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(start + array[i] + ",");
            }
            else if (i == array.length - 1) {
                System.out.print(array[i] + end);
            }
            else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
