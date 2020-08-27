/*
Functional interface is an interface that contains only one abstract method.
It can have only one functionality to exhibit.
 */

package student_igors_bartkevics.lesson_10.homework.level_3.task_6;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Flyable {
    void fly();
}


class Plane implements Flyable {

    private String name = "plane";
    private String model;
    Plane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + " '" + model + "' and I can fly very fast");
    }
}

class Rocket implements Flyable {

    private String name = "rocket";
    private String model;
    Rocket(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + " '" + model + "' and I can fly very high and very fast");
    }
}

class FlyableDemo {
    public static void main(String[] args) {
        List<Flyable> list = new ArrayList<>();
        list.add(new Plane("СУ-27"));
        list.add(new Rocket("Союз"));

        for (Flyable flyable : list) {
            flyable.fly();
        }
    }
}
