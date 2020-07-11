package student_anvars_intezars.home_tasks.lesson_3.day6.task26;

public class ProductDemo {

    public static void main(String[] args) {

        Product firstProduct = new Product();
            firstProduct.setName("Air Conditioner");
            firstProduct.setRegularPrice(300);
            firstProduct.setDiscount(15);

            System.out.println("Type of product: " + firstProduct.getName());
            System.out.println("Regular price: " + firstProduct.getRegularPrice());
            System.out.println("Current discount: " + firstProduct.getDiscount() + "%");

            System.out.println();
            System.out.println("Actual price of this product is " + firstProduct.getActualPrice());

    }
}
