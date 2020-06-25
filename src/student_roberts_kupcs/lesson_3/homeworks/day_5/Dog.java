package student_roberts_kupcs.lesson_3.homeworks.day_5;

class Dog {

    private String name;

    // Task_19
    //- Должна быть возможность указывать возраст собаки.
    //- Возраст указывается в годах (целам числом).
    //- Возраст собаке дают в момент создания.
    private  int age = 5;

    public Dog() {

        this.name = "Ku";

    }

    public void voice() {
        // Task_18
        // на консоль должно выводиться
        //кличка собаки и ее возраст.
        System.out.println("кличка собаки: " + name);
        // Task_19
        System.out.println(("кличка собаки: " + name + " " + age + " год"));
    }
}
