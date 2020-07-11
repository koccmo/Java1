/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
*/
package student_igors_bartkevics.lesson_5.homework.level_4;
import java.util.Scanner;
public class Task_25 {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of array:");
	int arrayLength = scanner.nextInt();
	int[] array = new int[arrayLength];
        for (int i = 0 ; i < arrayLength ; i++ ) {
			System.out.println("Enter array[" + i + "] : ");
			array[i] = scanner.nextInt();
        }

	for (int i = 0 ; i < arrayLength ; i++ ) {
		System.out.println("Array[" + i + "] : " + array[i]);	
        }
    }
}