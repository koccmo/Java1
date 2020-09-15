package student_vladislav_zagrebin.lesson_3.lesson_examples;

public class PhoneExample {

    // Свойства:
    // модель (Huawei P10, Samsung S3, .... ): String
    private String model;

    // цвет (Black, White, .... ): String
    private String colour;

    public PhoneExample () {
        this.model = "Samsung S3";
        this.colour = "Red";
    }

    public PhoneExample (String newModel) {
        this.model = newModel;
        this.colour = "Red";
    }

    public PhoneExample (String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    // Поведение:
    // включается
    public void switchOn() {

        System.out.println(this.model + " switching on! .....  ");
        System.out.println(this.model + " switching on! ....");
        System.out.println(this.model + " switching on! ...");
        System.out.println(this.model + " switching on! .. ");
        System.out.println(this.model + " switched on! DONE !");
    }
    // выключается
    public void switchOff() {

        System.out.println(this.model + " switching off! ..... " );
        System.out.println(this.model + " switching off! .... ");
        System.out.println(this.model + " switching off! ... ");
        System.out.println(this.model + " switching off! ..");
        System.out.println(this.model + " switching off! DONE ! ");

        }

    // звонить
    public void call(String phoneNumberToCall) {
            System.out.println(this.model + "call to number" + phoneNumberToCall);
        }

    // смс
    public void sendSms(String phoneNumber, String smsText) {
            System.out.println(this.model + " send sms with text " + smsText + " to number " + phoneNumber );
        }


    }





