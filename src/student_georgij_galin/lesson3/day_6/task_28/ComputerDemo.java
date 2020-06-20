package student_georgij_galin.lesson3.day_6.task_28;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", "Intel");
        String computerName = computer.getName();
        String computerModel = computer.getModel();
        System.out.println("Name : " + computerName);
        System.out.println("Model : " + computerModel);
    }
}