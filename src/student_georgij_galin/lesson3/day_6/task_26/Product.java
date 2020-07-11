package student_georgij_galin.lesson3.day_6.task_26;

public class Product {

    private final String name;
    public double price;
    public double discount;

    public Product(String name){
        this.name=name;
    }

    public double actualPrice(){
        return this.price-(this.price*this.discount/100);
    }

    public void printInformation(){
        System.out.println("Name of product: "+this.name+". It'costs "+this.actualPrice());
    }
}