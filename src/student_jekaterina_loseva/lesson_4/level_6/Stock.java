package student_jekaterina_loseva.lesson_4.level_6;

public class Stock {

    private String companyName;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;
    private String information;

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(double newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = currentPrice;
        } else if (newPrice < minPrice) {
            minPrice = currentPrice;
        }
    }

    public String getPrintInformation() {
           information = "Company = " + companyName + ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
           return information;
    }

    public void printInformation() {
        System.out.println(information);
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }





}
