package roman.lesson_8.homework.day_x.super_task_2;


class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: (10 - 5) * (20 / 5)

		Argument num1 = new Argument(10);
		Argument num2 = new Argument(5);
		MathOperation subtract = new Subtraction(num1, num2);
		System.out.println("Left subtract result = " + subtract.calculate());

		Argument num3 = new Argument(20);
		Argument num4 = new Argument(5);
		MathOperation divide = new Divide(num3, num4);
		System.out.println("Right divide result = " + divide.calculate());

		MathOperation multiply = new Multiply(subtract, divide);
		System.out.println("Final Multiply result = " + multiply.calculate());
	}

}
