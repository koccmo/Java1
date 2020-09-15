package student_aleksandra_maksimovic.lesson_4.level_6;
/*
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

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("goog", 10);

        google.updatePrice(15);
        google.updatePrice(1);
        google.updatePrice(7);

        google.printInformation();
    }
}
