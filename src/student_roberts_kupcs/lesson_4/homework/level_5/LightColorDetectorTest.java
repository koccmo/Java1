package student_roberts_kupcs.lesson_4.homework.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lcdt = new LightColorDetectorTest();
        lcdt.violetTest();
        lcdt.blueTest();
        lcdt.greenTest();
        lcdt.yellowTest();
        lcdt.orangeTest();
        lcdt.redTest();
        lcdt.InvisibleLightTest();

    }

    public void violetTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(390);
        if (result == "Violet") {
            System.out.println("violetTest1 = Ok");
        } else {
            System.out.println("violetTest1 = FAIL");

        }
    }

    public void blueTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(455);
        if (result == "Blue") {
            System.out.println("blueTest = Ok");
        } else {
            System.out.println("blueTest = FAIL");

        }
    }

    public void greenTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(510);
        if (result == "Green") {
            System.out.println("greenTest = Ok");
        } else {
            System.out.println("greenTest = FAIL");

        }
    }

    public void yellowTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(580);
        if (result == "Yellow") {
            System.out.println("yellowTest = Ok");
        } else {
            System.out.println("yellowTest = FAIL");

        }
    }

    public void orangeTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(610);
        if (result == "Orange") {
            System.out.println("orangeTest = Ok");
        } else {
            System.out.println("orangeTest = FAIL");

        }
    }

    public void redTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(741);
        if (result == "Red") {
            System.out.println("redTest = Ok");
        } else {
            System.out.println("redTest = FAIL");

        }
    }

    public void InvisibleLightTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(350);
        if (result == "Invisible Light") {
            System.out.println("Invisible Light Test = Ok");
        } else {
            System.out.println("Invisible Light Test = FAIL");

        }
    }

}
