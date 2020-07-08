package student_alexey_tretyakov.lesson_4.level_5;

public class LightColorDetector {

     private String waveColor;
     public String detect (int wavelength) {

         if ((380<=wavelength) && (wavelength<=449)) return waveColor ="Violet";
         if ((450<=wavelength) && (wavelength<=494)) return waveColor ="Blue";
         if ((495<=wavelength) && (wavelength<=569)) return waveColor ="Green";
         if ((570<=wavelength) && (wavelength<=589)) return waveColor ="Yellow";
         if ((590<=wavelength) && (wavelength<=619)) return waveColor ="Orange";
         if ((620<=wavelength) && (wavelength<=750)) return waveColor ="Red";
         else return waveColor= "Invisible Light";
        }


    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println("Color for wave 380 ... 449 nm is " + lightColorDetector.detect(390) + ".");
        System.out.println("Color for wave 450 ... 494 nm is " + lightColorDetector.detect(470) + ".");
        System.out.println("Color for wave 495 ... 569 nm is " + lightColorDetector.detect(520) + ".");
        System.out.println("Color for wave 570 ... 589 nm is " + lightColorDetector.detect(580) + ".");
        System.out.println("Color for wave 590 ... 619 nm is " + lightColorDetector.detect(600) + ".");
        System.out.println("Color for wave 620 ... 750 nm is " + lightColorDetector.detect(700) + ".");
        System.out.println("For other wave  is " + lightColorDetector.detect(970) + ".");
    }
}
