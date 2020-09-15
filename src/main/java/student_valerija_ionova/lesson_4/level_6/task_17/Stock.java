package student_valerija_ionova.lesson_4.level_6.task_17;

/*Task17
Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Класс Stock должен обладать следующими характеристиками:

Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice()
- Распечатать информацию об акции printInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().*/

class Stock {

    private String name;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double currentPrice){
        this.name = name;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }


    public void updatePrice(double newPrice){
        if (newPrice < this.minPrice) this.minPrice = newPrice;
        if (newPrice > this.maxPrice) this.maxPrice = newPrice;
        this.currentPrice = newPrice;
    }

    public void printInformation(){
        System.out.println("Company = \""+this.name+ "\", Current Price = "+this.currentPrice+"," +
                " Min Price = "+this.minPrice+", Max Price = "+this.maxPrice);
    }

    public String getInformation(){
        return("Company = \""+this.name+ "\", Current Price = "+this.currentPrice+"," +
                " Min Price = "+this.minPrice+", Max Price = "+this.maxPrice);
    }

}
