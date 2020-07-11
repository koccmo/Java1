package student_jekaterina_loseva.lesson_3.day_6.task_26;

public class Product {

    private String name;
    public double regularPrice;
    public double discount;

    public Product(String productName) {
        this.name = productName;
    }

    public double actualPrice() {
        return regularPrice - regularPrice * discount / 100 ;
    }

    public void printInformation() {
        System.out.println(name + " - regular price is: " + regularPrice +
                "\n price with discount is: " + actualPrice());
    }

}
