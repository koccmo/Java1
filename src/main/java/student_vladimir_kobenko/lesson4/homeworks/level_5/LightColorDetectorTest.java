package student_vladimir_kobenko.lesson4.homeworks.level_5;
//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")
public class LightColorDetectorTest<coloroftheLight2> {
    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 385;
        String color = " Violet ";
        String coloroftheLight1 = lightColorDetector.detect(wavelenght);

        if (coloroftheLight1 == color) {
            System.out.println("The " + color + "color test is Ok");
        } else System.out.println("The " + color + "test is failed");

        wavelenght = 490;
        color = " Blue ";
        String coloroftheLight2 = lightColorDetector.detect(wavelenght); {

            if (coloroftheLight2 == color) {
                System.out.println("The " + color + "color test is Ok");
            } else System.out.println("The " + color + "test is failed");
        }
        wavelenght = 496;
        color = " Green ";
        String coloroftheLight3 = lightColorDetector.detect(wavelenght); {

            if (coloroftheLight3 == color) {
                System.out.println("The " + color + "color test is Ok");
            } else System.out.println("The " + color + "test is failed");
        }
        wavelenght = 571;
        color = " Yellow ";
        String coloroftheLight4 = lightColorDetector.detect(wavelenght); {

            if (coloroftheLight4 == color) {
                System.out.println("The " + color + "color test is Ok");
            } else System.out.println("The " + color + "test is failed");
        }
        wavelenght = 591;
        color = " Orange ";
        String coloroftheLight5 = lightColorDetector.detect(wavelenght); {

            if (coloroftheLight5 == color) {
                System.out.println("The " + color + "color test is Ok");
            } else System.out.println("The " + color + "test is failed");
        }
        wavelenght = 621;
        color = " Red ";
        String coloroftheLight6 = lightColorDetector.detect(wavelenght); {

            if (coloroftheLight6 == color) {
                System.out.println("The " + color + "color test is Ok");
            } else System.out.println("The " + color + "test is failed");
        }
    }
}