/*
Исправьте код программы так, что бы он компилировался.
Изменения можно вносить только в класс HumanPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {

    }

}
 */
package student_igors_bartkevics.lesson_8.homework.level_2;

public class Task_8 {

    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

    class HumanPlayer extends Player {

        HumanPlayer(String name) {
            super(name);
        }

    }

}
