package student_dmitrijs_jasvins.lesson_4.day_6;

class Stock {
    private String name;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;


    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
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
        System.out.println("Company Name : " + name + ", Current price = "
                + currentPrice + ", minPrice = " + minPrice + ", maxPrice = " + maxPrice);
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }
}
