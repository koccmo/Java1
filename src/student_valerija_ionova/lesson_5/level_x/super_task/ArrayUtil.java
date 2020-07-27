package student_valerija_ionova.lesson_5.level_x.super_task;

/*Task25 Task26 Task27 Task28 Task29 Task 30*/

import java.util.Scanner;
import java.util.Random;

class ArrayUtil {


    //- запросите у пользователя с консоли длину массива
    public int inputOfArrayLength (){
        int arrayLength;
        do{
        System.out.println("Please input valid length of array:");
        Scanner scanner = new Scanner(System.in);
        arrayLength = scanner.nextInt();}
        while (arrayLength <1);
        return arrayLength;
    }

    //- создайте массив указанной пользователем длины
    public int [] newArray (int arrayLength){
        int []newArray = new int [arrayLength];
        return newArray;
    }

    //- заполните массив числами полученными от пользователя
    public int [] fillArray(int [] newArray){
        for (int i=0; i<newArray.length; i++) {
            System.out.println("Please input element Nr."+(i+1));
            Scanner scanner = new Scanner(System.in);
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    //- распечатайте на консоль все элементы массива.
    public void printArray(int [] array){
        System.out.print("Array: [ ");
        for (int element: array
             ) {
            System.out.print(element+" ");
        }
        System.out.println("]"+"\n");
    }

    //- заполните массив случайными числами
    public int [] fillArrayWithRandomNumbers(int [] newArray){
        Random random = new Random ();
        for (int i=0; i<newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

    //- создайте массив произвольной длины
    public int [] newArrayWithRandomLength (){
        Random random = new Random();
        int [] newArray = new int [random.nextInt(24)+1];
        return newArray;
    }

    //- найдите наибольшее число в массиве и выведети его на консоль.
    public void printMaxInArray (int [] array){
        int max = array[0];
        for (int element:array
             ) {
            if (element > max) max =element;
        }
        System.out.println("Max value in array: "+ max);
    }

    //- найдите наименьшее число в массиве и выведети его на консоль.
    public void printMinInArray (int [] array){
        int min = array[0];
        for (int element:array
        ) {
            if (element < min) min =element;
        }
        System.out.println("Min value in array: "+ min);
    }

    //- найдите все чётные числа в массиве и выведети их на консоль.
    public void printEvenNumbersOfArray (int [] array){
        System.out.print("Even elements from array: ");
        for (int element:array
             ) {
            if (element % 2 == 0){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    //- найдите все нечётные числа в массиве и выведети их на консоль
    public void printOddNumbersOfArray (int [] array){
        System.out.print("Odd elements from array: ");
        for (int element:array
        ) {
            if (element % 2 != 0){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

}
