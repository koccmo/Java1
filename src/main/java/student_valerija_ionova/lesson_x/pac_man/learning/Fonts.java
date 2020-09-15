package student_valerija_ionova.lesson_x.pac_man.learning;

import java.awt.*;

class Fonts {

    public static void main (String [] args){

        String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s : fonts){
            System.out.println(s);
        }


    }

}
