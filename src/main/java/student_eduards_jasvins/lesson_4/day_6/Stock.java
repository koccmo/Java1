package student_eduards_jasvins.lesson_4.day_6;

public class Stock {

    private String name;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(int price) {
        currentPrice = price;
        if (price > maxPrice) {
            maxPrice = price;
        }
        if (price < minPrice) {
            minPrice = price;
        }
    }

    public void printInformation() {
        System.out.println("Company =  " + name + ", Current price =  " + currentPrice + ", Min price =  "
                + minPrice +  ", Max price =  " + maxPrice);
    }

    public int getCurrentPrice() { return currentPrice; }
    public int getMaxPrice() { return maxPrice; }
    public int getMinPrice() { return minPrice; }
}
