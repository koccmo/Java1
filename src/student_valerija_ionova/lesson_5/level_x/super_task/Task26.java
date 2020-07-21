package student_valerija_ionova.lesson_5.level_x.super_task;


/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива

- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/


public class Task26 {
    public static void main(String [] args){

        ArrayUtil arrayUtil = new ArrayUtil();

        int arrayLength = arrayUtil.inputOfArrayLength();
        int [] newArray = arrayUtil.fillArrayWithRandomNumbers(arrayUtil.newArray(arrayLength));
        arrayUtil.printArray(newArray);

    }
}
