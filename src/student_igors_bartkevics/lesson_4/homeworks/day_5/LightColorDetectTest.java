package student_igors_bartkevics.lesson_4.homeworks.day_5;


class LightColorDetectTest {

    public static void main(String[] args) {

        LightColorDetectTest lightColorDetectTest = new LightColorDetectTest();

        lightColorDetectTest.invisibleLight();
        lightColorDetectTest.violetColorLight();
        lightColorDetectTest.blueColorLight();
        lightColorDetectTest.greenColorLight();
        lightColorDetectTest.yellowColorLight();
        lightColorDetectTest.orangeColorLight();
        lightColorDetectTest.redColorLight();
    }
        public void invisibleLight() { //Invisible light test
            int waveLength = 10;
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(waveLength);
            if (result.equals("Invisible Light")) {
                System.out.println("Invisible light test = OK");
            }
            else {
                System.out.println("Invisible light test = FAIL");
            }
        }

    public void violetColorLight() { //Violet color light test
        int waveLength = 380;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Violet")) {
            System.out.println("Violet color light test = OK");
        }
        else {
            System.out.println("Violet color light test = FAIL");
        }
    }

    public void blueColorLight() { //Blue color light test
        int waveLength = 460;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Blue")) {
            System.out.println("Blue color light test = OK");
        }
        else {
            System.out.println("Blue color light test = FAIL");
        }
    }

    public void greenColorLight() { //Green color light test
        int waveLength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Green")) {
            System.out.println("Green color light test = OK");
        }
        else {
            System.out.println("Green color light test = FAIL");
        }
    }

    public void yellowColorLight() { //Yellow color light test
        int waveLength = 580;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Yellow")) {
            System.out.println("Yellow color light test = OK");
        }
        else {
            System.out.println("Yellow color light test = FAIL");
        }
    }

    public void orangeColorLight() { //Orange color light test
        int waveLength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Orange")) {
            System.out.println("Orange color light test = OK");
        }
        else {
            System.out.println("Orange color light test = FAIL");
        }
    }

    public void redColorLight() { //Red color light test
        int waveLength = 750;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Red")) {
            System.out.println("Red color light test = OK");
        }
        else {
            System.out.println("Red color light test = FAIL");
        }
    }

}
