package student_anvars_intezars.home_tasks.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.TestViolet();
        lightColorDetectorTest.TestBlue();
        lightColorDetectorTest.TestGreen();
        lightColorDetectorTest.TestYellow();
        lightColorDetectorTest.TestOrange();
        lightColorDetectorTest.TestRed();
        lightColorDetectorTest.TestInvisibleLight1();
        lightColorDetectorTest.TestInvisibleLight2();
    }
        public void TestViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(381);
            if (result.equals("Violet")) {
                System.out.println("Violet wavelength test = OK");
            }
            else {
                System.out.println("Violet wavelength test = OK");
            }

        }
        public void TestBlue () {
        LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(450);
            if (result.equals("Blue")) {
                System.out.println("BLue wavelength test = OK");
            }
            else {
                System.out.println("Blue wavelength test = FAIL");
            }
        }
        public void TestGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(495);
            if (result.equals("Green")) {
                System.out.println("Green wavelength test = OK");
            }
            else {
                System.out.println("Green wavelength test = FAIL");
            }
        }
        public void TestYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(570);
            if (result.equals("Yellow")) {
                System.out.println("Yellow wavelength test = OK");
            }
            else {
                System.out.println("Yellow wavelength test = FAIL");
            }
        }
        public void TestOrange() {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(590);
            if (result.equals("Orange")) {
                System.out.println("Orange wavelength test = OK");
            }
            else {
                System.out.println("Orange wavelength test = FAIL");
            }
        }
        public void TestRed() {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(620);
            if (result.equals("Red")) {
                System.out.println("Red wavelength test = OK");
            }
            else {
                System. out.println ("Red wavelength test = FAIL");
            }
        }
        public void TestInvisibleLight1 () {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(800);
            if (result.equals("Invisible Light")) {
                System.out.println("Invisible Light test1 = OK");
            }
            else {
                System.out.println("Invisible Light test1 = FAIL");
            }
        }
        public void TestInvisibleLight2 () {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(379);
            if (result.equals ("Invisible Light")) {
                System.out.println("Invisible Light test2 = OK");
            }
            else {
                System.out.println("Invisible Light test2 = FAIL");
            }
        }





    }

