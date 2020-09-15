package student_valerija_ionova.lesson_x.pac_man.learning.pac_man_game;

import javax.swing.*;
import java.awt.*;

class Frame {
//1920 1080
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setSize(500, 300);
        //jFrame.setLocation(500, 300);
        //jFrame.setBounds(500, 500, 500, 300);
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolKit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 400, 600, 800);
        jFrame.setTitle("Pac-Man");
        return jFrame;
    }
}
