package student_valerija_ionova.lesson_x.pac_man.learning;

import student_dmitrijs_jasvins.lesson_9.day_2.task_12.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OnMouseClick {

    static Frame frame = new Frame();
    static JFrame jFrame = frame.getFrame();
    static JPanel jPanel = new JPanel();

    public static void main (String [] args) throws Exception{
        jFrame.add(jPanel);
        JButton button1 = new JButton("Change Color");
        jPanel.add(button1);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jPanel.setBackground(Color.blue);
            }
        });
    }

}
