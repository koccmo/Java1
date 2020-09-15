package student_eduards_jasvins.lesson_5.day_x;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */

public class Task_27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil =  new ArrayUtil();
        int[] array = arrayUtil.createArrayWithRandom();
        arrayUtil.fillArrayWithRandom(array);
        arrayUtil.printArrayInformationToConsole(array);
        arrayUtil.findMaxNumber(array);
    }
}
