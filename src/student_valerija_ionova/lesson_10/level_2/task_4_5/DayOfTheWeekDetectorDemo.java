package student_valerija_ionova.lesson_10.level_2.task_4_5;

/*Создайте класс DayOfTheWeekDetectorDemo.

В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
имплементация интерфейса, которую программа должна использовать для нахождения названия
дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
чтобы использовать её в дальнейшем.

В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.

Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
из трёх имплементаций интерфейса.

Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.

Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.*/

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        int number = 0;
        do {
            System.out.println("Please input number 1-7 to detect day of the week");
            Scanner newNumber = new Scanner(System.in);
            number = newNumber.nextInt();
        } while((number < 1) || (number > 7));
        System.out.println(dayOfTheWeekDetector.detectDayName(number)+"\n");
    }

    public static void main (String [] args){
        //DayOfTheWeekDetectorArrayVersion
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);

        System.out.println("DayOfTheWeekDetectorArrayVersion");
        dayOfTheWeekDetectorDemo.run();

        //DayOfTheWeekDetectorIfVersion
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);

        System.out.println("DayOfTheWeekDetectorIfVersion");
        dayOfTheWeekDetectorDemo.run();

        //DayOfTheWeekDetectorSwitchVersion
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);

        System.out.println("DayOfTheWeekDetectorSwitchVersion");
        dayOfTheWeekDetectorDemo.run();

    }

}
