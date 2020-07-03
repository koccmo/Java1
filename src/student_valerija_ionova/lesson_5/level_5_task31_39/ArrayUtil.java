package student_valerija_ionova.lesson_5.level_5_task31_39;

/*Task31
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.

Task33
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

Task35
    public void printArrayToConsole(int[] array)
Task36
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array)

Task38
Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.

*/

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
}
