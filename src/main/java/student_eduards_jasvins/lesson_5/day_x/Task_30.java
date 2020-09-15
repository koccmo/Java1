package student_eduards_jasvins.lesson_5.day_x;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */


public class Task_30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArrayWithRandom();
        arrayUtil.fillArrayWithRandom(array);
        arrayUtil.printArrayInformationToConsole(array);
        arrayUtil.findNotEvenNumber(array);
    }

}
