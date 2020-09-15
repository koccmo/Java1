package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;

class Layout {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        /*По умолчанию флоат лойоут - друг за другом
        jPanel.add(new JButton(("one")));
        jPanel.add(new JButton(("two")));
        jPanel.add(new JButton(("three")));*/

        /* Border
        jFrame.add(new JButton("one"), BorderLayout.NORTH);
        jFrame.add(new JButton("two"), BorderLayout.WEST);
        jFrame.add(new JButton("three"), BorderLayout.SOUTH);
        jFrame.add(new JButton("three"), BorderLayout.EAST);
        jFrame.add(new JButton("three"), BorderLayout.CENTER);*/

        //Grid
        jPanel.setLayout(new GridLayout(2, 2));
        jPanel.add(new Button("one"));
        jPanel.add(new Button("two"));
        jPanel.add(new Button("three"));
        jPanel.add(new Button("four"));

    }

}
