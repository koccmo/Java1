package student_valerija_ionova.lesson_4.level_x.super_task_4;

/*Инстанция класса LightColorDetector не имеет состояния,
        она stateless. Найдите в интернете, что такое stateless класс
        в программировании. Найдите способ использовать одну
        инстанцию класса LightColorDetector для всех тестов.

        Stateless object is an instance of a class without instance fields (instance variables).
        The class may have fields, but they are compile-time constants (static final).

stateless это объект который не имеет полей/переменных описывающих
его внутреннее состояние. Точнее объект может иметь поля, но это переменные типа static final, то есть неизменяемые.

НЕ ПОНИМАЮ ЧТО ЗА ИНСТАНЦИИ :)) */

public class LightColorDetectorTest {

    public void checkResultString(String name, String methodsResult, String rightResult){
        if (methodsResult == rightResult){
            System.out.println(name+" : OK");
        } else System.out.println(name+" : FAIL");
    }

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.universalTest();
    }

    public void universalTest() {
        LightColorDetector detector = new LightColorDetector();

        checkResultString("VioletTest ", detector.detect(381), "Violet");

        checkResultString("BlueTest ", detector.detect(460), "Blue");

        checkResultString("GreenTest ", detector.detect(506), "Green");

        checkResultString("YellowTest ", detector.detect(580), "Yellow");

        checkResultString("RedTest ", detector.detect(700), "Red");

        checkResultString("InvisibleTest ", detector.detect(0), "Invisible Light");
    }

}
