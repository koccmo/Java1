package student_anvars_intezars.home_tasks.lesson_3.day6;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;
    private double actualPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return regularPrice / 100 * discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getActualPrice() {
        return regularPrice - discount;
    }
}
