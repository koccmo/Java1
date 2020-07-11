package student_georgij_galin.lesson4.level_6;


public class StockDemo {
    public static void main(String[] args) {
       Stock stock = new Stock("Microsoft", 50);
        stock.printInformation();
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        stock.printInformation();
    }
}