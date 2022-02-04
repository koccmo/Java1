package roman.lesson_4.homework.day_5.task_16;

public class LightColorDetector {
    public String detect(int waveLenght){
        String color;
        if ((waveLenght >= 380) && (waveLenght <= 449)) {
            color = "Violet";
        }
        else if ((waveLenght >= 450) && (waveLenght <= 494)) {
             color = "Blue";
        }
        else if ((waveLenght >= 495) && (waveLenght <= 569)) {
             color = "Green";
        }
        else if ((waveLenght >= 570) && (waveLenght <= 589)) {
             color = "Yellow";
        }
        else if ((waveLenght >= 590) && (waveLenght <= 619)) {
             color = "Orange";
        }
        else if ((waveLenght >= 620) && (waveLenght <= 750)) {
             color = "Red";
        }
        else color = "Invisible Light";
        return color;
    }
}
