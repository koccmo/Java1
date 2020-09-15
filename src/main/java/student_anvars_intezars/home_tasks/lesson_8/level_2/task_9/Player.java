package student_anvars_intezars.home_tasks.lesson_8.level_2.task_9;

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


