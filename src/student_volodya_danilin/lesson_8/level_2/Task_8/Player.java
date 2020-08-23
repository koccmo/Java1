package student_volodya_danilin.lesson_8.level_2.Task_8;

import teacher.codereview.CodeReview;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

@CodeReview(approved = true)
class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}