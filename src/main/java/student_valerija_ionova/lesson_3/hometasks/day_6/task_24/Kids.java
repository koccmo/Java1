package student_valerija_ionova.lesson_3.hometasks.day_6.task_24;

/*Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.*/

class Kids {
    private String name;
    private int  age;

    public Kids(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayAboutYou(){
        System.out.println("Привет! Меня зовут "+this.name+". Мне "+age+".");
    }

    public void count(){
        if (this.age >=7) {System.out.println("Считаю до 2000 хорошо: 1 2 3 4 5 .. 1998 1999 2000");}
        else
            if(this.age>=5) {System.out.println("Считаю до 100ста хорошо: 1 2 3 ... 97 98 99 100");}
            else{
                System.out.println("Считаю до 10ти хорошо: 1 2 3 4 5 6 7 8 9 10");
                }


    }
}
