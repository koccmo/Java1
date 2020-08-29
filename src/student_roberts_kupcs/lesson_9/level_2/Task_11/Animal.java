package student_roberts_kupcs.lesson_9.level_2.Task_11;

//Создайте иерархию наследования из двух уровней (родительский и дочерний).
//Продемонстрируйте использование протектед конструктора в родительском классе.
//Продемонстрируйте вызов протектед конструктора из класса потомка.

class Animal {
    protected Animal(String arg) {
        System.out.println("Constructing an animal: " + arg);
    }
}

class Dog extends Animal {
    public Dog() {
        super("From Dog constructor");
        System.out.println("Constructing a dog.");
    }
}

class Test {

    public static void main(String[] args) {
        new Dog();
    }

}
