package student_aleksandra_maksimovic.lesson_4.level_6;
/*
Необходимо реализовать класс Stock ("акция") таким образом,
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
должны меняться только через метод updatePrice().
Написать тестовые сценарии для класса Stock в классе StockTest.

 */
public class Stock {

    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;



    public Stock (String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.println("Company = " + companyName + " Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
