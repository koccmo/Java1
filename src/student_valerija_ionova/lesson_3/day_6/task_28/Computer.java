package student_valerija_ionova.lesson_3.day_6.task_28;

/*Дописать код программы, что бы она запускалась
        и выводила на консоль производителя и модель компьютера.
        Менять можно только класс Computer.*/

class Computer {

    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
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
