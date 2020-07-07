package student_jaroslav_brutan.lesson_4.day_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();
    }
        public void violetTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(381);
        if (result .equals("Violet")) {
            System.out.println("Violet test - ok!");
        } else {
            System.out.println("Violet test - false!");
        }
        }
        public void blueTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(455);
        if (result .equals("Blue")) {
            System.out.println("Blue test - ok!");
        } else {
            System.out.println("Blue test - false!");
        }
        }
        public void greenTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(520);
        if (result .equals("Green")) {
            System.out.println("Green test - ok!");
        } else  {
            System.out.println("Green test - false!");
        }
        }
        public void yellowTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(579);
        if (result .equals("Yellow")) {
            System.out.println("Yellow test - ok!");
        } else {
            System.out.println("Yellow test - false!");
        }
        }
        public void orangeTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(605);
        if (result .equals("Orange")) {
            System.out.println("Orange test - ok!");
        } else {
            System.out.println("Orange test - false!");
        }
        }
        public void redTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(689);
        if (result .equals("Red")) {
            System.out.println("Red test - ok!");
        } else {
            System.out.println("Red test - false!");
        }
    }
    public void invisibleTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(25);
        if (result .equals("Invisible Light")) {
            System.out.println("Invisible light test - ok!");
        } else {
            System.out.println("Invisible light test - false!");
        }
    }
}
