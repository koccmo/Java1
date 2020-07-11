package student_eduards_jasvins.lesson_4.day_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Tello", 15 );
        stock.printInformation();
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        stock.printInformation();

    }
}
