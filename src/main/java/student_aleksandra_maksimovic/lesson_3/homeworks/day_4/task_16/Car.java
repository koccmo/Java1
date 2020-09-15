package student_aleksandra_maksimovic.lesson_3.homeworks.day_4.task_16;


      /*
        Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Car.
       */

class Car {

    private String model;

    public Car(String myCar) {
        this.model = myCar;
    }

    public String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
