package student_roberts_kupcs.lesson_3.homeworks.day_6;

class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;

    }
    double actualPrice(){
        return regularPrice * discount;

    }

    void printInformation(){
        System.out.println("Product : " + name + " актуальнaja стоимост = " + actualPrice());

    }

}
