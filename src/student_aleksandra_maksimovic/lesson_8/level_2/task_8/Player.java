package student_aleksandra_maksimovic.lesson_8.level_2.task_8;
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
public class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);

    }

}
