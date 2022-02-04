package roman.lesson_3.homework.day_6.task_28;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        dell.info();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println(dell.newModel());
        System.out.println(model);
        dell.againModel("zopa");
        dell.info();
        dell.newNew();
        dell.info();
        System.out.println(model);







    }
}
