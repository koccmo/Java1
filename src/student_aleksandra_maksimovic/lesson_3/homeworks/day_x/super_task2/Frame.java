package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task2;

public class Frame {
    public int scores = 0;
    public boolean strike = false;
    public boolean spare = false;
    public int bonusSpin = 2;

    public Frame() {
        this.print();
    }
    public void print() {
        System.out.println("scores " + scores + ", strike " + strike + ", spare " + spare);
    }

}
