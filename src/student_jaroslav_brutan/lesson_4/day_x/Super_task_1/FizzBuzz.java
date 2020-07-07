package student_jaroslav_brutan.lesson_4.day_x.Super_task_1;

public class FizzBuzz {
    public String detect(int number){
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return  "Buzz";
        else return ""+ number;
    }
}
