package student_roberts_kupcs.lesson_6.homework.level_1;

////Разберитесь, что делает класс указанный ниже.
////Это реализация одного из супер тасков предыдущего урока.
////Создайте класс FizzBuzzTest и напишите автоматические тесты
////на все сценарии. Упростите FizzBuzz класс!
////Убедитесь, что после упрощения автоматические тесты все проходят.
////
////PS: а нужно ли свойство класса initialNumber?
////Или метод detect можно реализовать без него?

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.fizzBuzzTest();
        test.buzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(30).equals("FizzBuzz")) {
            System.out.println("FizzBuzz test is OK");
        } else {
            System.out.println("FizzBuzz test is FAIL");
        }
    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(12).equals("Fizz")) {
            System.out.println("Fizz test is OK");
        } else {
            System.out.println("Fizz test is FAIL");
        }
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(10).equals("Buzz")) {
            System.out.println("Buzz test is OK");
        } else {
            System.out.println("Buzz test is FAIL");
        }
    }
}
