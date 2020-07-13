package student_sandra_arniece.lesson_4;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 10);
        stock.printInformation();
        stock.updatePrice(13);
        stock.updatePrice(22);
        stock.printInformation();
        stock.updatePrice(77);
        stock.updatePrice(55);
        stock.updatePrice(3);
        stock.updatePrice(19);
        stock.printInformation();
    }
}
