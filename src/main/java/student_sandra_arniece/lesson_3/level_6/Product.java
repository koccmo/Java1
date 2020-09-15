package student_sandra_arniece.lesson_3.level_6; //Task 26

class Product {

    private String name;
    public double regularPrice;
    public double discount;

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
        return regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation() {
        System.out.print("Buy " + this.name + " from: " + regularPrice + ", now with discount (" + discount + "%), only: " + actualPrice() + "!");
    }

}
