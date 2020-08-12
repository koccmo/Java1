package student_volodya_danilin.lesson_8.level_2.Task_8;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super("Jordan");
    }

}