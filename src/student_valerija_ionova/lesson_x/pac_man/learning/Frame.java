package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;

class Frame {


static JFrame getFrame() {
    JFrame jFrame = new JFrame() {    };
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //jFrame.setSize(500, 300);
    //jFrame.setLocation(500, 300);
    //jFrame.setBounds(500, 500, 500, 300);
    Toolkit toolKit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolKit.getScreenSize();
    jFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 250, 800, 500);
    jFrame.setTitle("Pac-Man soon...");
    return jFrame;
    }
}
