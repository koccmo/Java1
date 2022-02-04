package roman.lesson_5.homework.day_4.task_28;

import java.util.Random;

public class MinNumberOfArray {
    public static void main(String[] args) {
        MinNumberOfArray make = new MinNumberOfArray();

        int lengthOfMassive = make.numberOfMassive(3);
        int[] array = make.makeArray(lengthOfMassive);
        make.fillUpMassive(array);
        make.printAllMassive(array);
        System.out.println(make.minNumberOfMassive(array));

    }

    public int[] makeArray(int arrayLength){return new int[arrayLength];}

    public int numberOfMassive(int longMassive){
        return longMassive;
    }

    public void fillUpMassive(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void printAllMassive (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of Index [" + i + "] = " + array[i]);
        }
    }

    public int minNumberOfMassive(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }





}
