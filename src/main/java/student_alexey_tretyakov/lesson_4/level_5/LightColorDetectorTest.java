package student_alexey_tretyakov.lesson_4.level_5;

class LightColorDetectorTest {

    public void colorTest() {

        LightColorDetector lightColorDetector = new LightColorDetector();

        if (lightColorDetector.detect(390).equals("Violet")) {
            System.out.println("Violet test = OK.");
        } else {
            System.out.println("Violet test = FAIL.");
        }
        if (lightColorDetector.detect(490).equals( "Blue")) {
            System.out.println("Blue test = OK.");
        } else {
            System.out.println("Blue test = FAIL.");
        }
        if (lightColorDetector.detect(560).equals( "Green")) {
            System.out.println("Green test = OK.");
        } else {
            System.out.println("Green test = FAIL.");
        }
        if (lightColorDetector.detect(570) .equals( "Yellow") ){
            System.out.println("Yellow test = OK.");
        } else {
            System.out.println("Yellow test = FAIL.");
        }
        if (lightColorDetector.detect(600) .equals( "Orange")) {
            System.out.println("Orange test = OK.");
        } else {
            System.out.println("Orange test = FAIL.");
        }
        if (lightColorDetector.detect(700) .equals( "Red")) {
            System.out.println("Red test = OK.");
        } else {
            System.out.println("Red test = FAIL.");
        }
        if (lightColorDetector.detect(360) .equals( "Invisible Light") ){
            System.out.println("Invisible Light test = OK.");
        } else {
            System.out.println("Invisible Light test = FAIL.");
        }
        if (lightColorDetector.detect(800) .equals( "Invisible Light") ){
            System.out.println("Invisible Light test = OK.");
        } else {
            System.out.println("Invisible Light test = FAIL.");
        }         
    }



    public static void main(String[] args){

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.colorTest();

    }
}

