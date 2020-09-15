package student_aleksandra_maksimovic.lesson_6.level_5_6.task_19_27;
/*
Создайте класс Move с двумя свойствами:

    private int x;
    private int y;

и конструктором, который принимает два целых числа
- координаты клетки в которую хочет походить игрок
и get методами для этих свойств.

 */

public class Move {

    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
