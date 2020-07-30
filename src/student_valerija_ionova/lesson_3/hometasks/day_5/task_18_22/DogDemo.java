package student_valerija_ionova.lesson_3.hometasks.day_5.task_18_22;

/*Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
Task20
Создайте собаку,
заставьте её подать голос,
заставте её отпраздновать день рождение,
заставьте её подать голос снова и убедитесь в том,
что её возраст увеличился на 1.
Task22
заставте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет.*/

class DogDemo {
    public static void main (String[] args){
        Dog dog = new Dog("Bobby", 2, "pink");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("Red");
        dog.voice();
    }
}
