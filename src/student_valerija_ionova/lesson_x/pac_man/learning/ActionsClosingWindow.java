package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ActionsClosingWindow {

    public static void main (String [] args){
        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();

        jFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                int i = 0;
            }

        });


    }

}
