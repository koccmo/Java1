package student_valerija_ionova.lesson_10.level_3.task_6;

//Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
// Основное назначение – использование в лямбда выражениях и method reference.
//функциональные интерфейсы могут содержать дополнительно абстрактные методы, определенные в классе Object

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TestImpl {

    public static void main(String[] args){

        Test newTest = x -> x > 0;

        System.out.println(newTest.test(10));   //true

        System.out.println(newTest.test(0));

        System.out.println(newTest.test(-25));
    }

}


//Лямбда выражения
//лямбда-оператор, который представляет стрелку ->
//левая часть содержит список параметров выражения, а правая собственно представляет
// тело лямбда-выражения, где выполняются все действия.