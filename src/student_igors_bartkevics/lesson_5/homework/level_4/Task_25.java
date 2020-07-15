/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
*/
package student_igors_bartkevics.lesson_5.homework.level_4;
import java.util.Scanner;
class Task_25 {

    public static void main(String[] args) {
    	Task_25 task = new Task_25();
    	int arrayLength = task.getArrayLengthValueFromUser();
    	int[] array = task.createArray(arrayLength);
    	task.fillArrayWithNumbers(array);
    	task.printArrayToConsole(array);
    }

	public void printArrayToConsole(int[] array) {
		for (int i = 0 ; i < array.length ; i++ ) {
			System.out.println("Array[" + i + "] : " + array[i]);
		}
	}

	public void fillArrayWithNumbers(int[] array) {
    	Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array[" + i + "] : ");
			array[i] = scanner.nextInt(10);
		}
	}

	public int[] createArray(int arrayLength) {
		return new int[arrayLength];
	}

    public int getArrayLengthValueFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		return  scanner.nextInt();
	}

}