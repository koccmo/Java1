package student_anvars_intezars.home_tasks.lesson_8.level_2.task_7;

/*
Как вызвать конструктор родительского класса?
Ответ: При создании объекта в первую очередь вызывается конструктор его базового класса
       а только потом — конструктор самого класса, объект которого мы создаем.

Когда это нужно делать?
СНиже пример кода. Создали базовый класс Animal. Потом при создании объекта
Lion и Dog сначала отработает конструктор класса Animal и только потом конструкторы самих
объектов.



class Animal {

    String name;
    int age;

    class Lion extends Animal {
        Lion(String tail) {
            System.out.println("Mur, mur");
        }
    }

    class Dog extends Animal {
        Dog(String badge) {
            System.out.println("Vaf, vaf");
        }
    }
}*/
