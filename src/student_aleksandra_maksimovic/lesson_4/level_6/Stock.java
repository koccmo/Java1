package student_aleksandra_maksimovic.lesson_4.level_6;

import student_aleksandra_maksimovic.lesson_4.level_4.Calculator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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

10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

999  = 999

999 -> 1  = 999

999 -> 2 -> 1000 = 1000

999 -> 2 -> 1000 -> 8 = 1000


9 -> 27

Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
google.printInformation();
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
google.printInformation();

Вывод в консоль:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
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
