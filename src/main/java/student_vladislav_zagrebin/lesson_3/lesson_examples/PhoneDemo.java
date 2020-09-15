package student_vladislav_zagrebin.lesson_3.lesson_examples;

public class PhoneDemo {

    public static void main(String[] args) {

        PhoneExample samsung1 = new PhoneExample();
        PhoneExample samsung2 = new PhoneExample();
        PhoneExample samsung3 = new PhoneExample();

        PhoneExample huawei = new PhoneExample ( "Huawei P20");
        PhoneExample iphone = new PhoneExample ( "IPhone 10");

        PhoneExample blackIphone = new PhoneExample("Iphone", "Black");
        PhoneExample blueSamsung = new PhoneExample("Samsung", "Blue");

        blueSamsung.switchOn();
        blackIphone.switchOn();

        blueSamsung.switchOff();
        blackIphone.switchOff();

        blueSamsung.call("777");

        blueSamsung.call("123");

        blueSamsung.sendSms("777", "Hello!");
        blueSamsung.sendSms("777", "I love you!");
    }
}
