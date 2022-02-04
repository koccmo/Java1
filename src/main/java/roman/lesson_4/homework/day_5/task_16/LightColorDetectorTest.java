package roman.lesson_4.homework.day_5.task_16;



//import java.util.Scanner;

import java.sql.SQLOutput;

public class LightColorDetectorTest {
    public static LightColorDetector detector = new LightColorDetector();
    public static int counter = 0;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int waveLenght = sc.nextInt();
//        System.out.println(detector.detect(waveLenght));

        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.invisibleLightTest();
        detectorTest.violetLightTest();
        detectorTest.blueLightTest();
        detectorTest.greenColorTest();
        detectorTest.yellowColorTest();
        detectorTest.orangeColorTest();
        detectorTest.redColorTest();

        System.out.println(counter);
        detectorTest.method1();
        detectorTest.method1();

        System.out.println(detectorTest.method1());
        System.out.println(counter);




    }
    public void invisibleLightTest() {
        int waveLenght = 379;
        String color = detector.detect(waveLenght);
        if (color.equals("Invisible Light")) {
            System.out.println("Test number One Invisible Light OK!");
        } else {System.out.println("Test number One FAIL!!!");}
    }

    public void violetLightTest() {
        int waveLenght = 392;
        String result = detector.detect(waveLenght);
        if (result.equals("Violet")) {
            System.out.println("Violet color Test OK!");
        } else {System.out.println("Violet Test Fail!!!");}
    }

    public void blueLightTest() {
        int waveLenght = 460;
        String result = detector.detect(waveLenght);
        if (result.equals("Blue")) {
            System.out.println("Blue light Test OK!!!!");
        } else System.out.println("Blue Light Test FAIL!!!!");
    }
     public void greenColorTest() {
        int waveLenght = 496;
        String result = detector.detect(waveLenght);
        if (result.equals("Green")) {
            System.out.println("Green color Test OK!!!");
        } else System.out.println("Green color Test Fail!!!!!");
     }
     public void yellowColorTest() {
        int waveLenght = 580;
        String result = detector.detect(waveLenght);
        if (result.equals("Yellow")) {
            System.out.println("Yellow test OK!!!");
        } else System.out.println("Yellow test FAIL!!");
     }
     public void orangeColorTest() {
        int waveLenght = 602;
        String result = detector.detect(waveLenght);
        if (result.equals("Orange")) {
            System.out.println("Orange test OK!!!!");
        } else System.out.println("Orange test FAIL!!!");
     }
     public void redColorTest() {
        int waveLenght = 730;
        String result = detector.detect(waveLenght);
        if (result.equals("Red")) {
            System.out.println("Red test OK!!!!");
        } else System.out.println("Red test FAIL!!!!");
     }

    public Boolean method1() {
        counter ++;
        return counter == 2;
    }
}
