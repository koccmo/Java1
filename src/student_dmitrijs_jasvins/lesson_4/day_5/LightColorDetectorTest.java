package student_dmitrijs_jasvins.lesson_4.day_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTestFirstColor();
        lightColorDetectorTest.lightColorDetectorTestSecondColor();
        lightColorDetectorTest.lightColorDetectorTestThirdColor();
        lightColorDetectorTest.lightColorDetectorTestForthColor();
        lightColorDetectorTest.lightColorDetectorTestFifthColor();
        lightColorDetectorTest.lightColorDetectorTestSixColor();
        lightColorDetectorTest.lightColorDetectorTestInvisibleLight();
    }

    public void lightColorDetectorTestFirstColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectorColor = lightColorDetector.detect(400);
        if (detectorColor.equals("Violet")) {
            System.out.println("First color test = OK");
        } else {
            System.out.println("First color test = FAIL");
        }
    }

    public void lightColorDetectorTestSecondColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(480);
        if (detectedColor.equals("Blue")) {
            System.out.println("Second color test = OK");
        } else {
            System.out.println("Second color test = FAIL");
        }
    }

    public void lightColorDetectorTestThirdColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(530);
        if (detectedColor.equals("Green")) {
            System.out.println("Third color test = OK");
        } else {
            System.out.println(" Third color = FAIl");
        }
    }

    public void lightColorDetectorTestForthColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(580);
        if (detectedColor.equals("Yellow")) {
            System.out.println("The forth color test = OK");
        } else {
            System.out.println("The forth color test = FAIL");
        }
    }

    public void lightColorDetectorTestFifthColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(610);
        if (detectedColor.equals("Orange")) {
            System.out.println("The fifth color test = OK");
        } else {
            System.out.println("The fifth color test = FAIL");
        }
    }

    public void lightColorDetectorTestSixColor() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(730);
        if (detectedColor.equals("Red")) {
            System.out.println("The six color test = OK");
        } else {
            System.out.println(" The six color test = FAIL");
        }
    }

    public void lightColorDetectorTestInvisibleLight() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(150);
        if (detectedColor.equals("Invisible Light")) {
            System.out.println("Invisible light test = OK");
        } else {
            System.out.println("Invisible light test = FAIL");
        }
    }

}


