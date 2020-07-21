package student_valerija_ionova.lesson_5.level_x.super_task;

/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.*/

public class Task25 {
    public static void main (String [] args){
        ArrayUtil arrayUtil = new ArrayUtil();

        int arrayLength = arrayUtil.inputOfArrayLength();
        int [] newArray = arrayUtil.newArray(arrayLength);
        int [] filledArray = arrayUtil.fillArray(newArray);
        arrayUtil.printArray(filledArray);


    }

}
