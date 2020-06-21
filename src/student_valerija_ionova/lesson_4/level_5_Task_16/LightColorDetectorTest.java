package student_valerija_ionova.lesson_4.level_5_Task_16;

/* 380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")*/

public class LightColorDetectorTest {
    public static void main(String[] args){

        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(381).equals("Violet"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(460).equals("Blue"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(568).equals("Green"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(580).equals("Yellow"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(591).equals("Orange"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(700).equals("Red"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");

        if (detector.detect(0).equals("Invisible Light"))
            System.out.println("Method detect is working");
        else System.out.println("Method detect isn't working");
    }
}
