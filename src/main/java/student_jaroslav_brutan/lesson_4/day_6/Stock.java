package student_jaroslav_brutan.lesson_4.day_6;

public class Stock {

    private String name;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void updatePrice(double newPrice){
        if (newPrice < this.minPrice){
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice){
            this.maxPrice = newPrice;
        }
    }

    public void printInformation(){
        System.out.println("Company's name - " + this.name + ", share current price is - "
                + this.currentPrice + ", min price is - " + this.minPrice +
                ", max price is - " + this.minPrice);
    }
}
