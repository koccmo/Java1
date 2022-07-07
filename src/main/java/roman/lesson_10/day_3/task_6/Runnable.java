package roman.lesson_10.day_3.task_6;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Runnable {
    void run();
}

class Human implements Runnable{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("Im " + name + " and my age " + age + " still can Run" );
    }
}

class Dog implements Runnable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " ,they age is " + age + " and still can Run");
    }
}

class RunnableDemo {
    public static void main(String[] args) {
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(new Human("Alex", 34));
        runnableList.add(new Dog("Jimmi", 5));

        for (Runnable runnable : runnableList) {
            runnable.run();
        }
    }

}
/*
Functional interface is an interface that contains only one abstract method.
It can have only one functionality to exhibit.
 */
