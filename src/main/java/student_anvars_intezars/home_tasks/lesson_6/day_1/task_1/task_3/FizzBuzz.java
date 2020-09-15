package student_anvars_intezars.home_tasks.lesson_6.day_1.task_1.task_3;
/* Данная программа отвечает за реализацию проверки деления
полученного числа на 3 и 5. При делении на одно из этих чисел, выдаются слова
"Fizz", "Buzz".
В данном классе не нужно использовать private int initialNumber. Это отображено
в самих тестах.
 */

public class FizzBuzz {

	// условия лучше сразу выносить в отдельные private методы:
	//private boolean isDevidedBy3(int number)
	//private boolean isDevidedBy5(int number)
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }
}
