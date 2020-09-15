package student_igors_bartkevics.lesson_3.homeworks.day_6.task_24;

public class KettleDemo {

    public static void main(String[] args){

        Kettle kettle = new Kettle("Electrolux");

        kettle.setKettlePower(1500);
        kettle.setKettleVolume(1.6);

        kettle.switchOn();
        kettle.switchOff();

    }

}
