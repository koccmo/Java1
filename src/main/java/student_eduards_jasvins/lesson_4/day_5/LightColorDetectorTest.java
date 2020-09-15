package student_eduards_jasvins.lesson_4.day_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisiblelightTest();


    }
    public void violetTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(380).equals("Violet")) {
             System.out.println("Test violet = OK");
        } else {
             System.out.println("Test violet = FAIL");
         }
    }
    public void blueTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(450).equals("Blue")) {
             System.out.println("Test blue = OK");
        } else {
             System.out.println("Test blue = FAIL");
         }
    }
    public void greenTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(495).equals("Green")) {
             System.out.println("Test green = OK");
        } else {
             System.out.println("Test green = FAIL");
         }
    }
    public void yellowTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(570).equals("Yellow")) {
             System.out.println("Test yellow = OK");
        } else {
             System.out.println("Test yellow = FAIL");
         }
    }
    public void orangeTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(590).equals("Orange")) {
             System.out.println("Test orange = OK");
        } else {
             System.out.println("Test orange = FAIL");
         }
    }
    public void redTest() {
        LightColorDetector detector = new LightColorDetector();
         if (detector.detect(999).equals("Red")) {
             System.out.println("Test red = OK");
        } else {
             System.out.println("Test red = FAIL");
         }
    }
    public void invisiblelightTest() {
        LightColorDetector detector = new LightColorDetector();
        if (detector.detect(0).equals("Invisible Light!")) {
            System.out.println("Test invisible light = OK");
        } else {
            System.out.println("Test invisible light = FAIL");
        }
    }

}
