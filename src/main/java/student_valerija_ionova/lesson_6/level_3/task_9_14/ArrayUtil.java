package student_valerija_ionova.lesson_6.level_3.task_9_14;

/*Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task10
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task11
Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task12
Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task13
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task14
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
*/

//import java.util.Scanner;
import java.util.Random;

class ArrayUtil {


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

    public int howMuchNumbersXinArray(int number, int [] array){
        int result = 0;
        for (int element:array
        ) {
            if (element == number) result++;
        }
        return result;
    }

    public void replace(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                break;
            }
        }
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
            }
        }
    }

    public int [] reverseArray(int [] array){
        int [] reverseArray = new int [array.length];
        for (int i=0; i<array.length; i++){
            reverseArray[reverseArray.length-1-i] = array[i];
        }
        return reverseArray;
    }

    public void sortArray(int [] array) {
        int element;
        boolean sorted = false;
        while (!sorted){
            for (int i=0; i<array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    element = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = element;
                }
            }
            sorted = true;
                for (int j=0; j< array.length-1; j++){
                    if (array[j]>array[j+1]){
                        sorted = false;
                        break;
                    }

                }

        }
    }

}
