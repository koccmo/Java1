package student_volodya_danilin.lesson_8.level_2.Task_9;

import teacher.codereview.CodeReview;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

@CodeReview(approved = true)
class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name);
    }

}