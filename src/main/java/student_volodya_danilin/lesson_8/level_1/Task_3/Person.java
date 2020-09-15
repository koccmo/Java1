package student_volodya_danilin.lesson_8.level_1.Task_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Address {

    List<String> addressList = new ArrayList<>();

}

@CodeReview(approved = true)
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
/*
Если конструктор не задаёт/инициализирует никаких значений то они будут null либо 0
 */

