package student_igors_bartkevics.lesson_9.homework.level_2.task_11;

//Where use protected constructors?

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Phone {
    private int ringVolume;
    protected Phone(int ringVolume) {
        this.ringVolume = ringVolume;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ringVolume=" + ringVolume +
                '}';
    }

    public static void main(String[] args) {
        Phone phone = new Phone(5);
        System.out.println(phone);
    }
}
