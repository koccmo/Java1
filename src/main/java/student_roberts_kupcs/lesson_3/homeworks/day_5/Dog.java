package student_roberts_kupcs.lesson_3.homeworks.day_5;

class Dog {

    private String name;

    // Task_19
    //- Должна быть возможность указывать возраст собаки.
    //- Возраст указывается в годах (целам числом).
    //- Возраст собаке дают в момент создания.
    private  int age;

    // Task_21
    // - Сделайте возможность указывать цвет собаки.
    //- Пусть цвет задаётся просто строкой: "Red", "Black", etc.

    private String color;

    public Dog() {

        this.name = "Ku";
        this.age = 5;
        this.color = "Red";

    }

    public void voice() {
        // Task_18
        // на консоль должно выводиться
        //кличка собаки и ее возраст.
        System.out.println("кличка собаки: " + name + " ее возраст: " + age + " лет" + " " + color);
        // Task_19
    }

    public void happyBirthday() {
        // напишите тут команду увеличения возраста на 1
        this.age = age + 1;
        System.out.println("кличка собаки: " + name + " " + age + " лет");
    }

    // Task_22
    public void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство
        color = newColor;
        System.out.println("кличка собаки: " + name + " ее возраст: " + age + " лет" + " " + color);

    }

}
