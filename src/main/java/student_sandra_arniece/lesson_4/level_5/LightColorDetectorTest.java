package student_sandra_arniece.lesson_4.level_5; //Task 16

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest1();
        lightColorDetectorTest.invisibleTest2();
    }

    public void violetTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(380);
        if (result.equals("Violet")) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void blueTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(450);
        if (result.equals("Blue")) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void greenTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(495);
        if (result.equals("Green")) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void yellowTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(570);
        if (result.equals("Yellow")) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void orangeTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(590);
        if (result.equals("Orange")) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void redTest() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(620);
        if (result.equals("Red")) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void invisibleTest1() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(379);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible test1 = OK");
        } else {
            System.out.println("Invisible test1 = FAIL");
        }
    }

    public void invisibleTest2() {
        LightColorDetector lightColorDetect = new LightColorDetector();
        String result = lightColorDetect.detect(751);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible test2 = OK");
        } else {
            System.out.println("Invisible test2 = FAIL");
        }
    }

}
