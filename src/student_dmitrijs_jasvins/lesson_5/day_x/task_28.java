package student_dmitrijs_jasvins.lesson_5.day_x;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */

class task_28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayInformation(array);
        int minArray = arrayUtil.findMinNumber(array);
        System.out.println("Min number : " + minArray);
    }
}
