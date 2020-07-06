package student_igors_bartkevics.lesson_4.homeworks.day_x.super_task_4;


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

    public void checkResult(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            if (expectedResult.equals("Invisible Light")) {
                System.out.println(expectedResult + " test = OK");
            }
            else {
                System.out.println(expectedResult + " color light test = OK");
            }
        }
        else {
            if (expectedResult.equals("Invisible Light")) {
                System.out.println(expectedResult + " test = FAIL");
            }
            else {
                System.out.println(expectedResult + " color light test = FAIL");
            }
        }
    }

    LightColorDetector lightColorDetector = new LightColorDetector();

    public void invisibleLight() { //Invisible light test
        int waveLength = 10;
        String expectedResult = "Invisible Light";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void violetColorLight() { //Violet color light test
        int waveLength = 380;
        String expectedResult = "Violet";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void blueColorLight() { //Blue color light test
        int waveLength = 460;
        String expectedResult = "Blue";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void greenColorLight() { //Green color light test
        int waveLength = 500;
        String expectedResult = "Green";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void yellowColorLight() { //Yellow color light test
        int waveLength = 580;
        String expectedResult = "Yellow";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void orangeColorLight() { //Orange color light test
        int waveLength = 600;
        String expectedResult = "Orange";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

    public void redColorLight() { //Red color light test
        int waveLength = 750;
        String expectedResult = "Red";
        String result = lightColorDetector.detect(waveLength);
        checkResult(result, expectedResult);
    }

}
