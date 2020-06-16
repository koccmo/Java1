package student_dmitrijs_jasvins.lesson_3.day_4;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Dmitry");
        String modelClass = car.getModel();
        String modelOwner = car.getOwner();
        System.out.println("Car model and name is : " + modelClass + " and " + modelOwner);
    }
}
