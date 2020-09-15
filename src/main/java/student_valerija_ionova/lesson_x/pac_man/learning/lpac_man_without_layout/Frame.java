package student_valerija_ionova.lesson_x.pac_man.learning.lpac_man_without_layout;

import javax.swing.*;

class Frame {
//1920 1080
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setBounds(500, 500, 500, 300);
        //Toolkit toolKit = Toolkit.getDefaultToolkit();
        //Dimension dimension = toolKit.getScreenSize();
        jFrame.setBounds(400, 90, 600, 700);
        jFrame.setTitle("Pac-Man");
        return jFrame;
    }
}
