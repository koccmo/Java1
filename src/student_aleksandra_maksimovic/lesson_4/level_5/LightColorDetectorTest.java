package student_aleksandra_maksimovic.lesson_4.level_5;

import student_aleksandra_maksimovic.lesson_4.level_4.Calculator;
import student_aleksandra_maksimovic.lesson_4.level_4.CalculatorTest;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.InvisibleRangeTest1();
        lightColorDetectorTest.InvisibleRangeTest2();
        lightColorDetectorTest.VioletRangeTest();
        lightColorDetectorTest.BlueRangeTest();
        lightColorDetectorTest.GreenRangeTest();
        lightColorDetectorTest.YellowRangeTest();
        lightColorDetectorTest.OrangeRangeTest();
        lightColorDetectorTest.RedRangeTest();
    }
    public void InvisibleRangeTest1() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(379);
        if (result .equals("Invisible Light") ) {
            System.out.println("InvisibleRange1 test = OK");
        } else {
            System.out.println("InvisibleRange1 test = FAIL");
        }
    }
    public void InvisibleRangeTest2() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(751);
        if (result .equals("Invisible Light") ) {
            System.out.println("InvisibleRange2 test = OK");
        } else {
            System.out.println("InvisibleRange2 test = FAIL");
        }
    }
    public void VioletRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(381);
        if (result .equals("Violet") ) {
            System.out.println("Violet Range test = OK");
        } else {
            System.out.println("Violet Range = FAIL");
        }
    }
    public void BlueRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(451);
        if (result .equals("Blue") ) {
            System.out.println("Blue Range test = OK");
        } else {
            System.out.println("Blue Range test = FAIL");
        }
    }
    public void GreenRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(568);
        if (result .equals("Green") ) {
            System.out.println("Green Range test = OK");
        } else {
            System.out.println("Green Range test = FAIL");
        }
    }
    public void YellowRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(588);
        if (result .equals("Yellow") ) {
            System.out.println("Yellow Range test = OK");
        } else {
            System.out.println("Yellow Range test = FAIL");
        }
    }
    public void OrangeRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(619);
        if (result .equals("Orange") ) {
            System.out.println("Orange Range test = OK");
        } else {
            System.out.println("Orange Range test = FAIL");
        }
    }
    public void RedRangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(750);
        if (result .equals("Red") ) {
            System.out.println("Red Range test = OK");
        } else {
            System.out.println("Red Range test = FAIL");
        }
    }
}

