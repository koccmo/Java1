package student_aleksandra_maksimovic.lesson_4.level_x.task_1;
/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }

}

Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.
 */
public class FizzBuzz {
    public String detect (int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return "" +  number;
        }
    }
}
