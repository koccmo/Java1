package roman.lesson_4.homework.day_6.task_17;

public class Stock {
    private final String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int price) {
        this.name = name;
        this.currentPrice = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    public void updatePrice(int newPrice){
        if (newPrice > maxPrice ) {
            maxPrice = newPrice;
        }
        else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        currentPrice = newPrice;
    }
    public int seeMaxPrice() {
        return maxPrice;
    }
    public int seeMinPrice() {
        return minPrice;
    }
    public int seeCurrentPrice() {
        return currentPrice;
    }
    public String getPriceInformation() {
        return "Company name : " + name + " Current Price = " + currentPrice +
                " Min Price = " + minPrice + " Max Price = " + maxPrice;
    }

}
