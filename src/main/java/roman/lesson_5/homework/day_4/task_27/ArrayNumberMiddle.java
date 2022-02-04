package roman.lesson_5.homework.day_4.task_27;

import java.util.Random;
import java.util.Scanner;

public class ArrayNumberMiddle {
    public static void main(String[] args) {
        ArrayNumberMiddle check = new ArrayNumberMiddle();

        int arrayLong = check.setNumberMassive();
        int[] array = check.madeArray(arrayLong);
        check.setIndexNumbers(array);
        check.printAllNumbers(array);
        System.out.println(check.maxNumber(array));


    }

    public int[] madeArray(int arrayLength) {return new int[arrayLength];}

    public int setNumberMassive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of massive");
        return scanner.nextInt();
    }

    public void setIndexNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i <  array.length ; i++){
            array[i] = random.nextInt(10);
        }
    }

    public void printAllNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of Index [" + i + "] = " + array[i]);
        }
    }

    public int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
               max = array[i];
            }
        }
        return max;
    }






}
