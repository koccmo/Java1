package student_vladimir_kobenko.lesson4.homeworks.level_6;
//Свойства:
//- Имя компании
//- Текущая стоимость
//- Минимальная стоимость
//- Максимальная стоимость
//
//Методы:
//- Обновить текущую стоимость акции updatePrice()
//- Распечатать информацию об акции printInformation()
public class Stock {private String nameofCompany; private double currentPrice; private double minPrice;
    private double maxPrice;

    public Stock(String nameofCompany, double currentPrice){
        this.nameofCompany = nameofCompany;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }


    public double updatePrice(double newPrice){
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        this.currentPrice = newPrice;
        return newPrice;
    }

    public String printInformation(){
        System.out.println("Company = \""+this.nameofCompany+ "\", Current Price = "+this.currentPrice+"," +
                " Min Price = "+this.minPrice+", Max Price = "+this.maxPrice);
        return null;
    }

    public String getInformation(){
        return("Company = \""+this.nameofCompany+ "\", Current Price = "+this.currentPrice+"," +
                " Min Price = "+this.minPrice+", Max Price = "+this.maxPrice);
    }

}