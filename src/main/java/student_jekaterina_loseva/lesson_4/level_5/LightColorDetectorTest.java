package student_jekaterina_loseva.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest colorTest = new LightColorDetectorTest();
        colorTest.violetColorTest();
        colorTest.bluetColorTest();
        colorTest.greenColorTest();
        colorTest.yellowColorTest();
        colorTest.orangeColorTest();
        colorTest.invisibleLightColorTest();
    }

    public void violetColorTest() {
        int wavelength = 380;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Violet")) {
            System.out.println("VioletColorTest = OK");
        } else {
            System.out.println("VioletColorTest = FAIL");
        }
    }

    public void bluetColorTest() {
        int wavelength = 450;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Blue")) {
            System.out.println("BlueColorTest = OK");
        } else {
            System.out.println("BlueColorTest = FAIL");
        }
    }

    public void greenColorTest() {
        int wavelength = 500;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Green")) {
            System.out.println("GreenColorTest = OK");
        } else {
            System.out.println("GreenColorTest = FAIL");
        }
    }

    public void yellowColorTest() {
        int wavelength = 589;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Yellow")) {
            System.out.println("YellowColorTest = OK");
        } else {
            System.out.println("YellowColorTest = FAIL");
        }
    }

    public void orangeColorTest() {
        int wavelength = 600;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Orange")) {
            System.out.println("OrangeColorTest = OK");
        } else {
            System.out.println("OrangeColorTest = FAIL");
        }
    }

    public void redColorTest() {
        int wavelength = 750;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Red")) {
            System.out.println("RedColorTest = OK");
        } else {
            System.out.println("RedColorTest = FAIL");
        }
    }

    public void invisibleLightColorTest() {
        int wavelength = 1000;
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(wavelength);
        if (result.equals("Invisible Light")) {
            System.out.println("invisibleLightColorTest = OK");
        } else {
            System.out.println("invisibleLightColorTest = FAIL");
        }
    }

}
