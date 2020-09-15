package student_eduards_jasvins.lesson_4.day_x;

public class FizzBuzz {
    public String detect(int number) {
        if ((number % 3 ==0 ) && (number % 5 == 0)){
            return "FizzBuzz";
        } if (number % 3 == 0 ) {
            return "Fizz";
        } if (number % 5 == 0 ) {
            return "Buzz";
        } else {
            return "" +  number; }
    }
}
