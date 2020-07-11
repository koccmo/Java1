package student_valerija_ionova.lesson_3.hometasks.day_5.task_18_22;

/*Task18
Создать класс собака (Dog)
- У собаки должна быть кличка.
- Собака должна уметь выполнять команду голос (voice())
Task_19
Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целам числом).
- (voice()),при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.
Task_20
 научите собаку праздновать свой день рождения
Task21
 - Сделайте возможность указывать цвет собаки.
- (voice()),при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.
Task 22
- Должна быть возможность менять цвет собаки на другой.*/

public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }

    public void happyBirthday(){
        this.age++;
    }
    public void voice(){
        System.out.println(this.name+" "+this.age+"  "+this.color);
    }
}
