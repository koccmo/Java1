package student_volodya_danilin.lesson_2.day_x;

//Исправьте ошибки компиляции в данной программе.
//
//public class CorrectDataTypes {
//
//	public static void main(String[] args) {
//
//		int numberOne = 10;
//		double numberTwo = 20.0;
//
//		System.out.println("Number 1 = " + numberOne);
//		System.out.println("Number 2 = " + numberTwo);
//                                                            <- тип данных float занимает 4 байта памяти, а double - 8
//		float sum = numberOne + numberTwo;                    <- поэтому тут у суммы не хватит памяти на numberTwo
//
//		System.out.println("Sum = " + sum);
//	}
//
//}

public class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}