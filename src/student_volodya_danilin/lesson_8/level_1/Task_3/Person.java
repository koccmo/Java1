package student_volodya_danilin.lesson_8.level_1.Task_3;

import java.util.ArrayList;
import java.util.List;

class Address {

    List<String> addressList = new ArrayList<>();

}


class Person {

    private String fullName;
    private int age;
    private Address address;

    public static void main(String[] Args) {
        Person person = new Person();
        person.showValues();

    }

    void showValues() {
        System.out.println("Default value of String : " + this.fullName);
        System.out.println("Default value of Integer : " + this.age);
        System.out.println("Default value of Object : " + this.address);
    }

}

