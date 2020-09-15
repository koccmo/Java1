package student_alexey_tretyakov.lesson_4.level_6;

public class Stock {
    private String companyName;
    private double minPrice;
    private double maxPrice;
    private double currentPrice;
    public Stock (String companyName,double setPrice){
        this.companyName = companyName;
        this.currentPrice = setPrice;
        this.minPrice = setPrice;
        this.maxPrice = setPrice;
    }
    public void printInformation(){
        System.out.println("Company " + companyName + ", Current Price = " + currentPrice
        + ", Min Price = " + minPrice +", Max Price = " + maxPrice + ".");
    }

    public double getMinPrice(){
        return this.minPrice;
    }  // пустая строка между методами улучшает читаемость кода
    public double getMaxPrice(){
        return this.maxPrice;
    }
    public double getCurrentPrice (){
        return this.currentPrice;
    }
    public void updatePrice ( double setPrice ){
        currentPrice = setPrice ;
        if ( minPrice > setPrice) minPrice = setPrice;
        if (maxPrice < setPrice) maxPrice = setPrice;
    }

}
