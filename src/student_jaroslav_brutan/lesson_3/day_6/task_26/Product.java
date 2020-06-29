package student_jaroslav_brutan.lesson_3.day_6.task_26;

public class Product {
    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name){
        this.name = name;
    }
    public double actualPrice(){
        return this.regularPrice-(this.regularPrice * this.discount / 100);
    }
    public void printInformation(){
        System.out.println("Product - " + this.name + ". Actual price is - " + this.actualPrice());
    }
}
