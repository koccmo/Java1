package student_dmitrijs_jasvins.lesson_3.day_6.task_26;

class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        double discountedPrice = regularPrice - (regularPrice * discount / 100);
        return discountedPrice;
    }

    public void printInformation() {
        System.out.println("Product name : " + name);
        System.out.println("Product regular price : " + regularPrice);
        System.out.println("Discount : " + discount);
        System.out.println("Product price with discount : " + actualPrice());
    }
}
