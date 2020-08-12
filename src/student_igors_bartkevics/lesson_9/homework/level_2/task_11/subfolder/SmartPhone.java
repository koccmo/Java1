package student_igors_bartkevics.lesson_9.homework.level_2.task_11.subfolder;

import student_igors_bartkevics.lesson_9.homework.level_2.task_11.Phone;

public class SmartPhone extends Phone {

    public SmartPhone(int ringVolume) {
        super(ringVolume);
    }

    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone(3);
        System.out.println(smart);

        //Phone phone = new Phone(4); ERROR
    }

}
