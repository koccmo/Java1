package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_28;

      /*  Дописать код программы, что бы она запускалась
        и выводила на консоль производителя и модель компьютера.
       Менять можно только класс Computer.
      */
class Computer {

    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // для удобства чтения программы соблюдайте правила форматирования кода
	// отступы должны быть на одном уровне
    public String getManufacturer() {
          return manufacturer;
      }
    public String getModel() {
      return model;
    }
}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}

