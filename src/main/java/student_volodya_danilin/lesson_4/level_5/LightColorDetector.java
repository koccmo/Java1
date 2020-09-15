package student_volodya_danilin.lesson_4.level_5;

import java.util.Scanner;


public class LightColorDetector {
    public String detect(int waveLenght) {
        if ((waveLenght >= 380) && (waveLenght <= 449)) {
            return "Violet";
        } else if ((waveLenght >= 450) && (waveLenght <= 494)){
            return "Blue";
        } else if ((waveLenght >= 495) && (waveLenght <= 569)) {
            return "Green";
        } else if ((waveLenght >= 570) && (waveLenght <= 589)) {
            return "Yellow";
        } else if ((waveLenght >= 590) && (waveLenght <= 619)) {
            return "Orange";
        } else if ((waveLenght >= 620) && (waveLenght <= 750)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}

class LightColorDetectorTestInput {
    public static void main(String[] Args) {

        Scanner inputData = new Scanner(System.in);
        int waveLenght;

        System.out.println("Enter your wavelenght: ");
        waveLenght = inputData.nextInt();
        LightColorDetector newDetector = new LightColorDetector();
        String result = newDetector.detect(waveLenght);
        System.out.println(result);

    }
}

class LightColorDetectorTest {
    public static void main(String[] Args) {
        LightColorDetector newDetector = new LightColorDetector();

        String result = newDetector.detect(380);
        System.out.println("380 is " + result);

        result = newDetector.detect(1000);
        System.out.println("1000 is " + result);

        result = newDetector.detect(450);
        System.out.println("450 is " + result);

        result = newDetector.detect(495);
        System.out.println("495 is" + result);

        result = newDetector.detect(570);
        System.out.println("570 is " + result);

        result = newDetector.detect(590);
        System.out.println("590 is " + result);

        result = newDetector.detect(620);
        System.out.println("620 is " + result);

        result = newDetector.detect(449);
        System.out.println("449 is " + result);

        result = newDetector.detect(494);
        System.out.println("494 is " + result);

        result = newDetector.detect(569);
        System.out.println("569 is " + result);

        result = newDetector.detect(589);
        System.out.println("589 is " + result);

        result = newDetector.detect(619);
        System.out.println("619 is " + result);

        result = newDetector.detect(750);
        System.out.println("750 is " + result);
    }
}