package roman.lesson_4.homework.day_6.task_17;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Google",10);
        System.out.println(google.getPriceInformation());
        google.updatePrice(11);
        System.out.println(google.getPriceInformation());
        google.updatePrice(12);
        System.out.println(google.getPriceInformation());
        google.updatePrice(11);
        System.out.println(google.getPriceInformation());
        google.updatePrice(13);
        System.out.println(google.getPriceInformation());



    }
}
