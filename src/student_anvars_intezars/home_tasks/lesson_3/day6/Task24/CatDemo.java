package student_anvars_intezars.home_tasks.lesson_3.day6.Task24;

import student_anvars_intezars.home_tasks.lesson_3.day6.Task24.Cat;

public class CatDemo {

    public static void main(String[] args) {

        Cat kitten = new Cat ();
            kitten.setName("Barsik");
            kitten.setAge(1);
            kitten.setColor("White");

            System.out.println("Cat's name is " + kitten.getName());
            System.out.println ("Young cat is " + kitten.getAge());
            System.out.println("His color is " + kitten.getColor());

            System.out.println();
            kitten.makesMur();
            kitten.asksForFood();
    }
}
