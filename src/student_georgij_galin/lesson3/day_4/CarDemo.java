package student_georgij_galin.lesson3.day_4;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Georgij");
        String modelClass = car.getModel();
        String modelOwner = car.getOwner();
        System.out.println("Car model and name is : " + modelClass + " and " + modelOwner);
    }
}