package student_valerija_ionova.lesson_6.level_3.task_9;

/*Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.*/

import java.util.Scanner;
import java.util.Random;

public class ArrayUtil {


    public int [] createArray(int arrayLength){
        int newArray [] = new int [arrayLength];
        return newArray;
    }

    public void fillArrayWithRandomNumbers(int [] array){
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int [] array){
        for (int element:array
        ) {
            System.out.print(element+" ");
        }
        System.out.println("\n");
    }

    public int findMaxNumber (int [] array){
        int max = array[0];
        for (int element:array
        ) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array){
        int min =array[0];
        for (int element:array
        ) {
            if (element < min){
                min = element;
            }
        }
        return min;
    }

    public boolean ifContainsNumber(int number, int [] array){
        boolean ifContains = false;
        for (int element : array
        ) {
            if (element == number) ifContains = true;
        }
        return ifContains;
    }

}
