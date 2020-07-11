package student_valerija_ionova.lesson_4.level_5_Task_16;

/* 380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")*/

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.invisibleTestTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.yellowTest();
    }

    public void violetTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(381).equals("Violet"))
            System.out.println("VioletTest = OK");
        else System.out.println("VioletTest = FAIL");
    }

    public void blueTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(460).equals("Blue"))
            System.out.println("blueTest = OK");
        else System.out.println("blueTest = FAIL");
    }

    public void greenTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(506).equals("Green"))
            System.out.println("GreenTest = OK");
        else System.out.println("GreenTest = FAIL");
    }

    public void yellowTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(580).equals("Yellow"))
            System.out.println("YellowTest = OK");
        else System.out.println("YellowTest = FAIL");
    }

    public void orangeTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(591).equals("Orange"))
            System.out.println("OrangeTest = OK");
        else System.out.println("OrangeTest = FAIL");
    }

    public void redTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(700).equals("Red"))
            System.out.println("RedTest = OK");
        else System.out.println("RedTest = FAIL");
    }

    public void invisibleTestTest(){
        LightColorDetector detector = new LightColorDetector();

        if (detector.detect(0).equals("Invisible Light"))
            System.out.println("InvisibleTestTest = OK");
        else System.out.println("InvisibleTestTest = FAIL");
    }
    }

