package student_vladimir_kobenko.lesson4.homeworks.level_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
String printCompanyName = google.printInformation();

double getNewPrice = google.updatePrice(15);
        getNewPrice = google.updatePrice(7);
        getNewPrice = google.updatePrice(14);
        printCompanyName = google.printInformation();
    }
}
