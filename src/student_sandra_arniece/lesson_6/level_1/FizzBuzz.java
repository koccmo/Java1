package student_sandra_arniece.lesson_6.level_1; //Task_3

class FizzBuzz {

    public String detect(int initialNumber) {

		// условия лучше сразу выносить в отдельные private методы:
		//private boolean isDevidedBy3(int number)
		//private boolean isDevidedBy5(int number)

		if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }

}
