package student_jekaterina_loseva.lesson_4.level_6;

public class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        google.getPrintInformation();
        google.printInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.getPrintInformation();
        google.printInformation();
    }

}
