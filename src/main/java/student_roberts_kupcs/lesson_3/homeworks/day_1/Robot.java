package student_roberts_kupcs.lesson_3.homeworks.day_1;

    // Task_1
    // Создайте класс робот (Robot).
class Robot {

    // Task_12
    // Добавьте в класс Robot свойство name
    private String name;

    private String speak;

    // Создайте в классе Robot метод
    public void sayHello() {

        System.out.println("Hello");
    }

    // Task_2
    // В классе робот (Robot) создайте конструктор без параметров
    public Robot (String robotName) {
        this.name = robotName;

    }

    //Task_5
    //Создайте в классе Robot метод
    public void sayYourName() {
        System.out.println("My name is " + this.name);

    }
}
