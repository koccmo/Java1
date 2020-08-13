package student_igors_bartkevics.lesson_9.homework.level_2.task_11.subfolder;

import student_igors_bartkevics.lesson_9.homework.level_2.task_11.Phone;

public class SmartPhone extends Phone {

    protected SmartPhone(int ringVolume) {
        super(ringVolume);   //где зранится и кому пренадлежит?
    }

    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone(3); //для чего нужно поле, если к нему нет доступа?
        System.out.println(smart);                      //как это можно использовать?
        //Phone phone = new Phone(4); ERROR
        Phone smart1 = new SmartPhone(4);

    }

}
