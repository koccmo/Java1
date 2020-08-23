package student_roberts_kupcs.lesson_8.homework.level_2.Task_9;

//Внесите изменения в код программы так,
//чтобы можно было создать экземпляр класса
//ComputerPlayer. Класс ComputerPlayer должен
//наследоваться от класса Player. Изменения
//в код можно вносить только в класс ComputerPlayer.
//

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

}
