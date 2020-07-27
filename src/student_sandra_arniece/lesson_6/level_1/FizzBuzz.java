package student_sandra_arniece.lesson_6.level_1; //Task_3

class FizzBuzz {

    public String detect(int initialNumber) {
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }

}
