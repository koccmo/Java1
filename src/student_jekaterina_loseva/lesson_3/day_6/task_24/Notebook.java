package student_jekaterina_loseva.lesson_3.day_6.task_24;

public class Notebook {

    private String brand;
    private boolean ssd;
    private int ram;

    public Notebook(String brand, boolean ssd, int memory) {
        this.brand = brand;
        this.ssd = ssd;
        this.ram = memory;
    }

    public void isSsd() {
        System.out.println(brand + " " + ram + "gb." + " Has a ssd?");
        if (ssd) {
            System.out.println("Yes, it's great!");
        } else {
            System.out.println("No, search in next time!");
        }
    }

}
