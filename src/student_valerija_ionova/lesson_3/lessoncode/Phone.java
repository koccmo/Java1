package student_valerija_ionova.lesson_3.lessoncode;

class Phone {
    private String model;
    private String color;

    public Phone (String model){
        this.model = model;
    }

    public void on(){
        System.out.println("On!");
    }

    public void off() {
        System.out.println("Off!");
    }

    public void call(String phoneNumber){
        System.out.println("We call to "+phoneNumber);
    }

    public void sms(String phoneNumber, String message){
        System.out.println("Phone sends sms: "+message+" to number: "+phoneNumber);
    }
}
