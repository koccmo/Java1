package student_roberts_kupcs.lesson_5.homework.level_5_6;

//Task31
//Создайте класс ArrayUtil.
//Создайте в этом классе метод для создания
//массива целых чисел указанной длины.


import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int arrayIntegers[] = new int[arrayLength];
        return arrayIntegers;
    }

//Task33
// Создайте в классе ArrayUtil метод для
//заполнения массива целых чисел случайными числами.
//

    public void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();

    }

    // Task35
    // Создайте в классе ArrayUtil метод для
    //распечатки массива целых чисел на консоль.

    public void printArrayToConsole(int[] array) {

    }

    //Task36
    //Создайте в классе ArrayUtil метод для
    //нахождения максимального числа в массиве целых чисел.

    //public int findMaxNumber(int[] array) {

    //}
}
