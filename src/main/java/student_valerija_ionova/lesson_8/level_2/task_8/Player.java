package student_valerija_ionova.lesson_8.level_2.task_8;

import teacher.codereview.CodeReview;

/*Исправьте код программы так, что бы он компилировался.
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

}*/
class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

}

@CodeReview(approved = true)
class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super (name);
    }

}
