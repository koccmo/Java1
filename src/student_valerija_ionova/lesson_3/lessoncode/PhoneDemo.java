package student_valerija_ionova.lesson_3.lessoncode;

public class PhoneDemo {
    public static void main (String[] args){
        Phone siemens = new Phone("Siemens");

        siemens.on();

        siemens.call("2222222");

        siemens.sms("239877", "Nice day!");

        siemens.off();
    }
}
