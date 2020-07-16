package student_roberts_kupcs.lesson_6.homework.level_1;

//Разберитесь, что делает класс указанный ниже.
//Это реализация одного из супер тасков предыдущего урока.
//Создайте класс FizzBuzzTest и напишите автоматические тесты
//на все сценарии. Упростите FizzBuzz класс!
//Убедитесь, что после упрощения автоматические тесты все проходят.
//
//PS: а нужно ли свойство класса initialNumber?
//Или метод detect можно реализовать без него?

class FizzBuzz {
    //private int initialNumber;

    public String detect(int number) {
        //this.initialNumber = number;
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }
}
