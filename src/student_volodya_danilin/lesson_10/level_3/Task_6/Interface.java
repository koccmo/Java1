package student_volodya_danilin.lesson_10.level_3.Task_6;
/*
Функциональный интефрейс - это любой интерфейс в котором описан
лишь 1 абстрактный метод(незаимплементированный).

Ниже приведён пример :
 */

interface Interface {
    void abstractPrint(String message);     // <- абстрактный метод

    default void defaultPrint(String message) { // <- default'ный метод
        System.out.println(message);
    }

    static void staticPrint(String message) {  // <- статичный метод
        System.out.println(message);
    }
}

class Implementation {
    public static void main(String[] args) {

        Interface interface1 = new Interface() {
            @Override
            public void abstractPrint(String message) {
                System.out.println(message);
            }
        };

        interface1.abstractPrint("using abstract method in interface1");

        /*
        Имплементацию показанную выше можно укоротить method-reference'ом
        т.к. у нас функциональный интерфейс где нужно имплементить лишь 1
        метод
         */

        Interface interface2 = System.out::println;
        interface2.abstractPrint("using abstract method in interface2");

    }
}
