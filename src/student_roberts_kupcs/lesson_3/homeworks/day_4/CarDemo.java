package student_roberts_kupcs.lesson_3.homeworks.day_4;

import student_roberts_kupcs.lesson_3.homeworks.day_4.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
