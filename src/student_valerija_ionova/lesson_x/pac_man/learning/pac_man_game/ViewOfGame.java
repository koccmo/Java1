package student_valerija_ionova.lesson_x.pac_man.learning.pac_man_game;

import javax.swing.*;
import java.awt.*;

class ViewOfGame {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel, BorderLayout.CENTER);
        jPanel.setBackground(Color.gray);

        JPanel jPanel1 = new JPanel();
        jFrame.add(jPanel1, BorderLayout.NORTH);
        jPanel1.setBackground(Color.darkGray);

        JPanel jPanel2 = new JPanel();
        jFrame.add(jPanel2, BorderLayout.EAST);
        jPanel2.setBackground(Color.green);

        JPanel jPanel3 = new JPanel();
        jFrame.add(jPanel3, BorderLayout.WEST);
        jPanel3.setBackground(Color.red);

        JPanel jPanel4 = new JPanel();
        jFrame.add(jPanel4, BorderLayout.SOUTH);
        jPanel4.setBackground(Color.yellow);

        jFrame.revalidate();

        jPanel1.add(new Figures());
        jPanel1.repaint();
    }
}
