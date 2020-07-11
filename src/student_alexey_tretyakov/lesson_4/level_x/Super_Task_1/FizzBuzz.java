package student_alexey_tretyakov.lesson_4.level_x.Super_Task_1;

public class FizzBuzz {

    public void FizzBuzz(){}
    public String detect ( int number) {
    	// а не осложняет ли это сложение остатков чтение и понимание программы?
        if (((number % 3) + (number % 5)) == 0) return "FizzBuzz";
        else {
            if ((number % 3) == 0) return "Fizz";
            if ((number % 5) == 0) return "Buzz";
            else return ("" + number);
        }

    }
}
