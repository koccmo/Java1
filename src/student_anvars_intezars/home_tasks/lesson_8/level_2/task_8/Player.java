package student_anvars_intezars.home_tasks.lesson_8.level_2.task_8;

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
