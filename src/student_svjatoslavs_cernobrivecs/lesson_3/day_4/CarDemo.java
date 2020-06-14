package student_svjatoslavs_cernobrivecs.lesson_3.day_4;

public class CarDemo {

    public static void main(String[] args){
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        // Changed "myPhone" on "myCar"
        System.out.println("Car model = " + carModel);
    }
}
