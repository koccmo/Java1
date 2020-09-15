package student_svjatoslavs_cernobrivecs.lesson_3.day_6.task_26;

public class Product {

    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double actualPrice(){
        return price - (price / 100 * discount);
    }
    public void printInformation(){
        System.out.println("Product: " + name + "\n" +
                "Price: " + actualPrice());
    }
}
