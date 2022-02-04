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
package student_igors_bartkevics.lesson_4.homeworks.day_6;

class Stock {

    private String nameOfCompany;
    private double price;
    private double minPrice;
    private double maxPrice;

    public Stock(String nameOfCompany, double price) {
        this.nameOfCompany = nameOfCompany;
        this.price = this.maxPrice = this.minPrice = price;
    }

    public String printInformation() {
        // Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
        String result = "Company = \"" + nameOfCompany + "\", Current Price = " + price +
                            ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
        System.out.println(result);
        return result;
    }

    public double getPrice() {
        return price;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }

        else if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
    }
}
