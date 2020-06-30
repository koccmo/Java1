package student_georgij_galin.lesson3.day_6.task_26;


import student_valerija_ionova.lesson_3.hometasks.day_6.task_26.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Television");
        product.price=800;
        product.discount=30;
        product.printInformation();


    }
}