package student_aleksandra_maksimovic.lesson_10.level_2.task_4_5;

import java.util.Scanner;

/*
Цель этой программы:
- запросить у пользователя число;
- с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
- вывести на консоль найденное название.

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
названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.
 */
class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number fro 1 to 7");
        int userNumber = scan.nextInt();
        System.out.println(this.dayOfTheWeekDetector.detectDayName(userNumber));
    }


    public static void main(String[] args) {
        // - Demo If Version
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demoIfVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorIfVersion);
        demoIfVersion.run();
        // - Demo Switch Version
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo demoSwitchVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorSwitchVersion);
        demoSwitchVersion.run();
        // - Demo Array Version
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo demoArrayVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorArrayVersion);
        demoArrayVersion.run();

    }
}
