package student_alexey_tretyakov.lesson_4.level_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock myCompany = new Stock("LKOH", 17);
        myCompany.printInformation();
        myCompany.updatePrice(10);
        myCompany.printInformation();
        myCompany.updatePrice(12);
        myCompany.printInformation();
        myCompany.updatePrice(5);
        myCompany.printInformation();
        myCompany.updatePrice(7);
        myCompany.printInformation();
        myCompany.updatePrice(99);
        myCompany.printInformation();
        myCompany.updatePrice(77);
        myCompany.printInformation();
    }
}
