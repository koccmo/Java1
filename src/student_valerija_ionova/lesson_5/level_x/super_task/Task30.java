package student_valerija_ionova.lesson_5.level_x.super_task;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.*/

public class Task30 {
    public static void main(String [] args){
        ArrayUtil arrayUtil = new ArrayUtil();

        int [] newArray = arrayUtil.newArrayWithRandomLength();
        int [] filledArray = arrayUtil.fillArrayWithRandomNumbers(newArray);

        arrayUtil.printArray(filledArray);
        arrayUtil.printOddNumbersOfArray(filledArray);

    }
}
