package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LookAndFeelTest {

    public static void main (String [] args){
        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton button1 = new JButton("Metal");
        JButton button2 = new JButton("Nimbus");
        JButton button3 = new JButton("CDE/Motif");
        JButton button4 = new JButton("Windows");
        JButton button5 = new JButton("Windows Classic");

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        jPanel.add(button5);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                }catch (Exception el){
                    el.printStackTrace();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                }catch (Exception el){
                    el.printStackTrace();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                }catch (Exception el){
                    el.printStackTrace();
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }catch (Exception el){
                    el.printStackTrace();
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                }catch (Exception el){
                    el.printStackTrace();
                }
            }
        });
    }

}
