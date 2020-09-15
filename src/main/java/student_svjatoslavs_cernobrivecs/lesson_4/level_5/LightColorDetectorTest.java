package student_svjatoslavs_cernobrivecs.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args){

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
    }

    public void violetTest(){
        int wavelength = 380;
        LightColorDetector violet = new LightColorDetector();
        String result = violet.detect(wavelength);
        if (result.equals("Violet")){
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blueTest(){
        int wavelength = 450;
        LightColorDetector blue = new LightColorDetector();
        String result = blue.detect(wavelength);
        if (result.equals("Blue")){
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void greenTest (){
        int wavelength = 495;
        LightColorDetector green = new LightColorDetector();
        String result = green.detect(wavelength);
        if (result.equals("Green")){
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void yellowTest (){
        int wavelength = 570;
        LightColorDetector yelllow = new LightColorDetector();
        String result = yelllow.detect(wavelength);
        if (result.equals("Yellow")){
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orangeTest (){
        int wavelenght = 590;
        LightColorDetector orange = new LightColorDetector();
        String result = orange.detect(wavelenght);
        if (result.equals("Orange")){
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void redTest(){
        int wavelenght = 620;
        LightColorDetector red = new LightColorDetector();
        String result = red.detect(wavelenght);
        if (result.equals("Red")){
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
}
