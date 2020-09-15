package student_aleksandra_maksimovic.lesson_4.level_x.task_4;

/*Дан класс LightColorDetector и его тест LightColorDetectorTest.
        Найдите способ упростить тесты в LightColorDetectorTest.

        Тесты тоже должны быть написаны как можно лучше и качественнее!
        Дублирование кода - это почти всегда плохая идея в программировании.
        Поэтому от дублирования кода нужно избавляться.

        Подсказка: вынесите в отдельный метод проверку
        результата и замените её вызовом метода в каждом тесте.

        Инстанция класса LightColorDetector не имеет состояния,
        она stateless. Найдите в интернете, что такое stateless класс
        в программировании. Найдите способ использовать одну
        инстанцию класса LightColorDetector для всех тестов.

*/

class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}


class LightColorDetectorTest {
    private LightColorDetector lightColorDetector;

    public LightColorDetectorTest() {

        this.lightColorDetector =  new LightColorDetector();
    }

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.testViolet(405);
        lightColorDetectorTest.testBlue(475);
        lightColorDetectorTest.testGreen(505);
        lightColorDetectorTest.testYellow(585);
        lightColorDetectorTest.testOrange(619);
        lightColorDetectorTest.testRed(620);
        lightColorDetectorTest.testInvisible(760);

    }
    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Invisible Light")) {
            System.out.println("LightColorDetector test - Invisible Light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible Light = FAIL");
        }
    }
}
