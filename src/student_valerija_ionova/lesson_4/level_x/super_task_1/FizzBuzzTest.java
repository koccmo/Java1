package student_valerija_ionova.lesson_4.level_x.super_task_1;

/*Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.*/

import student_valerija_ionova.lesson_4.level_x.super_task_1.FizzBuzz;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.buzzTest();  // название метода с маленькой буквы
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }


    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(15).equals("FizzBuzz"))
            System.out.println("Test FizzBuzz = OK ");
        else System.out.println("Test FizzBuzz = FAIL");

    }

    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(3).equals("Fizz"))
            System.out.println("Test Fizz = OK ");
        else System.out.println("Test Fizz = FAIL");

    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(5).equals("Buzz"))
            System.out.println("Test Buzz = OK ");
        else System.out.println("Test Buzz = FAIL");

    }


    public void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(4).equals("4"))
            System.out.println("Test NotFizzBuzz = OK ");
        else System.out.println("Test NotFizzBuzz = FAIL");

    }

    }

