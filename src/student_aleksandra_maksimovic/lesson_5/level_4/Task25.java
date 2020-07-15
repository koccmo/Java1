package student_aleksandra_maksimovic.lesson_5.level_4;
/*'
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import java.util.Scanner;

import teacher.lesson_6.lessoncode.ArrayUtil;

public class Task25 {
    public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthFromUser();
		int[] array = arrayUtil.createArray(arrayLength);
		arrayUtil.fillArrayWithNumbersFromUser(array);
		//arrayUtil.printArrayToConsole(array);
		String str = arrayUtil.convertArrayToString(array);
		System.out.println(str);


    	// int arrayLength = arrayUtil.getArrayLengthFromUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array !");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        // arrayUtil.fillArrayWithNumbersFromUser(array);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your item Nr : " + (i + 1));
            int item = scanner.nextInt();
            arr[i] = item;
        }

        // arrayUtil.printArrayToConsole(array);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
    }
}
