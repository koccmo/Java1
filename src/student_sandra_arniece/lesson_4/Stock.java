package student_sandra_arniece.lesson_4;
//Task 17
public class Stock {
    private final String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice= currentPrice;
    }
    public void updatePrice(int updatedPrice){
        currentPrice = updatedPrice;
        if (updatedPrice < minPrice) {
            minPrice = updatedPrice;
        } else if (updatedPrice > maxPrice) {
            maxPrice = updatedPrice;
        }
    }
    public void printInformation(){
        System.out.println("Company = " + companyName + " , Current price = " + currentPrice + " , Min price = " +
                minPrice + " , Max price = " + maxPrice);
    }
    public double getCurrentPrice(){
    return currentPrice;
    }
    public double getMinPrice(){
        return minPrice;
    }
    public double getMaxPrice(){
        return maxPrice;
    }
}
