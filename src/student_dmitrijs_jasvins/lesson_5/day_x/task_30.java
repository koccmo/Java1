package student_dmitrijs_jasvins.lesson_5.day_x;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */

class task_30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayInformation(array);
        arrayUtil.findOddNumber(array);
    }
}
