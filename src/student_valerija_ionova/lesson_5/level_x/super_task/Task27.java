package student_valerija_ionova.lesson_5.level_x.super_task;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/

public class Task27 {

    public static void main (String [] args){
        ArrayUtil arrayUtil = new ArrayUtil();

        int [] newArray = arrayUtil.newArrayWithRandomLength();
        int [] filledArray = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArray);
        arrayUtil.printMaxInArray(filledArray);

    }

}
