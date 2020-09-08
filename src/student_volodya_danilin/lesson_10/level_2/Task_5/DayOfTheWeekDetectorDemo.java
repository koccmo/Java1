package student_volodya_danilin.lesson_10.level_2.Task_5;

import student_dmitrijs_jasvins.lesson_10.day_1.task_2.ArrayUtil;
import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    @CodeReviewComment(teacher = "Remove unused field!")
    Scanner userInput = new Scanner(System.in);
	@CodeReviewComment(teacher = "Remove unused field!")
    int userNumber;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] Args) {

        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorIfVersion("If method");
        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(detectorIf);

        System.out.println("\nTest 1 \nTesting " + demoIf.detector.getDetectorName() + " ... ");
        System.out.println("Entering 7, demoIf : " + demoIf.detector.detectDayName(7));
        if (demoIf.detector.detectDayName(7).equals("Sunday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, demoIf : " + demoIf.detector.detectDayName(8));


        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion("Switch method");
        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(detectorSwitch);

        System.out.println("\nTest 2 \nTesting " + demoSwitch.detector.getDetectorName() + " ... ");
        System.out.println("Entering 7, demoSwitch : " + demoSwitch.detector.detectDayName(7));
        if (demoSwitch.detector.detectDayName(7).equals("Sunday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, demoSwitch : " + demoSwitch.detector.detectDayName(8));


        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion("String Array method");
        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(detectorArray);

        System.out.println("\nTest 3 \nTesting " + demoArray.detector.getDetectorName() + " ... ");
        System.out.println("Entering 7, demoArray : " + demoArray.detector.detectDayName(7));
        if (demoArray.detector.detectDayName(7).equals("Sunday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, demoArray : " + demoArray.detector.detectDayName(8));

        System.out.println("\nAuto tests are finished! \nStarting app ... ");

        run();
    }

    static void run() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion("IF method");
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(detector);

        System.out.println("\n\n\nWelcome to : \nWhats the day today? \nDefault method is IF method," +
                "\nYou can proceed with the tests!");
        Scanner sc = new Scanner(System.in);
        int totalTests = 0;
        while (true) {
            System.out.println("\n\n=== MAIN MENU ===");
            System.out.println("1. Select testing method");
            System.out.println("2. Input numbers for testing");
            System.out.println("3. Stop application");
            System.out.print("Enter : ");
            int menuNumberSelect = sc.nextInt();

            if (menuNumberSelect == 1) {
                    System.out.println("=== METHOD MENU ===");
                    System.out.println("1. IF method");
                    System.out.println("2. SWITCH method");
                    System.out.println("3. String Array method");
                    System.out.print("Enter : ");
                    int methodNumberSelect = sc.nextInt();

                    if (methodNumberSelect == 1) {
                        detector = new DayOfTheWeekDetectorIfVersion("IF method");
                        demo = new DayOfTheWeekDetectorDemo(detector);
                        System.out.println("If method loaded!");
                    }
                    if (methodNumberSelect == 2) {
                        detector = new DayOfTheWeekDetectorSwitchVersion("SWITCH method");
                        demo = new DayOfTheWeekDetectorDemo(detector);
                        System.out.println("Switch method loaded!");
                    }
                    if (methodNumberSelect == 3) {
                        detector = new DayOfTheWeekDetectorArrayVersion("String Array method");
                        demo = new DayOfTheWeekDetectorDemo(detector);
                        System.out.println("String Array method loaded!");
                    }
            }
            if (menuNumberSelect == 2) {
                int numberToDetect = 0;
                while (numberToDetect != 44) {
                    System.out.println("\n=== NUMBER ENTRY MENU ===");
                    System.out.println("Enter 44 to go back");
                    System.out.println("Enter numbers for testing ... ");
                    System.out.print("Enter : ");
                    numberToDetect = sc.nextInt();
                    if (numberToDetect != 44) {
                        totalTests++;
                        System.out.println(". . . . . . . . . . ");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(demo.detector.detectDayName(numberToDetect) + " ");
                        }
                        System.out.println("\n' ' ' ' ' ' ' ' ' '");
                        System.out.println("Using " + detector.getDetectorName());
                    }
                    else {
                        System.out.println("Total tests : " + totalTests);
                        System.out.println("Loading menu ... ");
                    }
                }
            }
            if (menuNumberSelect == 3) {
                System.out.println("Quitting ... ");
                return;
            }
        }
    }
}
