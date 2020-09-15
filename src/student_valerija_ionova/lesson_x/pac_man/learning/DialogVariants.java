package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogVariants {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("Show dialog");
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(jPanel, "this is message dialog", "title", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showOptionDialog(jPanel, "message", "title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"one", "two", "three"}, "two");
                JOptionPane.showInputDialog(jPanel, "some message");

            }
        });


    }
}
