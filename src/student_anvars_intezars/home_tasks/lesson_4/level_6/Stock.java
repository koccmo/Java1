package student_anvars_intezars.home_tasks.lesson_4.level_6;

public class Stock {

    private String name;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMinPrice () {
        return minPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void updatePrice(int currentPrice, int minPrice, int maxPrice) {
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public void printInformation() {
        System.out.println("Company " + name + " Current price = " + currentPrice + ",");
        System.out.println("Min price = " + minPrice);
        System.out.println("Maximum price = " + maxPrice);
    }

}
