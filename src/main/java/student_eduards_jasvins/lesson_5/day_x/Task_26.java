package student_eduards_jasvins.lesson_5.day_x;
/* Напишите программу, в которой:
        - запросите у пользователя с консоли длину массива
        - создайте массив указанной пользователем длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива.
        */

public class Task_26 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromUser();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandom(array);
        arrayUtil.printArrayInformationToConsole(array);
    }
}
