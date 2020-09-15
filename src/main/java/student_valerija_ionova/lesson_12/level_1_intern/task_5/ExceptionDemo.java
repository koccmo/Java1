package student_valerija_ionova.lesson_12.level_1_intern.task_5;

/*Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.*/

class ExceptionDemo extends Exception{

    public Exception ex1 = new Exception();

    public Exception ex2 = new Exception("Message");

    ArithmeticException arithmeticException = new ArithmeticException();
    public Exception ex3 = new Exception("Message", arithmeticException);

    public Exception ex4 = new Exception(arithmeticException);





}
