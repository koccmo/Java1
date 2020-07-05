package student_igors_bartkevics.lesson_4.homeworks.day_x.Super_task_1;

class FizzBuzz {
    // Реализуйте следующие требования:
    // - если переданное число делится на три возвращайте "Fizz"
    // - если переданное число делится на пять возвращайте "Buzz"
    // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
    // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else {
            return "" + number;
        }
    }

}
