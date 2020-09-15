package student_aleksandra_maksimovic.my_exercises;

class Phone {

    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}