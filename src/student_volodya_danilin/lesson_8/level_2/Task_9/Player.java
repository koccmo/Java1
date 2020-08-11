package student_volodya_danilin.lesson_8.level_2.Task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name);
    }

}