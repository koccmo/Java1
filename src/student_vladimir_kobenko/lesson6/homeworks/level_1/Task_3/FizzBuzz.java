package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_3;

public class FizzBuzz {
    public String detect(int number) {

		// условия лучше сразу выносить в отдельные private методы:
		//private boolean isDevidedBy3(int number)
		//private boolean isDevidedBy5(int number)

		if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }
}
