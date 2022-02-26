package roman.lesson_9.homework.day_2.task_11.sub;

import roman.lesson_9.homework.day_2.task_11.TV;

public class Samsung extends TV {

    private String model;

    public Samsung (String manufacturing, String model) {
        super(manufacturing);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "manufacturing='" + manufacturing + '\'' +
                ", name='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Samsung samsung = new Samsung("Samsung", "UHD-123");
        System.out.println(samsung);
        TV samsung2 = new Samsung("Samsung","LED-23");
    }
}
