package student_alexey_tretyakov.lesson_8.homework.level_2;

public class Task_8 {
    class Player {

        protected String name;

        Player(String name) {
            this.name = name;
        }

    }

    class HumanPlayer extends Player {

        HumanPlayer(String name) {
              super(name);
        }
        void sayName(){
            System.out.println("My name is " + super.name);
        }
    }

}
