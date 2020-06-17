package student_volodya_danilin.lesson_2.day_x;

//Исправьте ошибки компиляции в данной программе.
//
//public class SumTwoNumbers {
//
//	public static void main(String[] args) {
//
//		int numberOne;                                     <- не были объявлены значения переменных
//		int numberTwo;
//
//		System.out.println("Number 1 = " + numberOne);     <- система не знает с какими значениями работать
//		System.out.println("Number 2 = " + numberTwo);
//
//		int numberOne = 10;                                <- не нужно указывать тип данных переменной второй раз
//		int numberTwo = 20;
//
//		int sum = numberOne + numberTwo;
//
//		System.out.println("Sum = " + sum);
//	}
//
//}

public class SumTwoNumbers {
    public static void main(String[] args) {

            int numberOne = 10, numberTwo = 20;

            System.out.println("Number 1 = " + numberOne);
            System.out.println("Number 2 = " + numberTwo);

            int sum = numberOne + numberTwo;

            System.out.println("Sum = " + sum);
    }
}
