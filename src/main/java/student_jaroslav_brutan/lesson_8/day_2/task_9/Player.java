package student_jaroslav_brutan.lesson_8.day_2.task_9;

public class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

    class ComputerPlayer extends Player{

        public ComputerPlayer(String name){
            super(name);
        }
    }
}
